package com.ats.contoller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ats.bean.Contact;
import com.ats.service.ContactService;

/**
 * Class name : ViewContactController<br>
 *@author KUMAR <br>
 *@apiNote This class is to handle request processing logic for Screen "All Contact" Page
 *created Dec 22nd 2019
*/
@Controller
public class ViewContactController {
	
	private static final Logger logger = LoggerFactory.getLogger(ViewContactController.class);
	/**
	 * variable name : service<br>
	 *@author KUMAR <br>
	 *@apiNote This service var holds one of the implementation class of ContactService(I)<br> <br>
	 *created Dec 22nd 2019
	*/
	@Autowired
	private ContactService contactService;
	
	/**
	 * method name : editContact<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to display form page with all ready available data for update contact details<br>
	 *@param model <br>
	 *@return String <br>
	 *created Dec 22nd 2019
	*/
	@RequestMapping(value = "/editContact", method = RequestMethod.GET)
	public String editContact(HttpServletRequest request,Model model) {
		logger.info("editContact() executed");
		int cid = Integer.parseInt(request.getParameter("contactId"));
		Contact c = contactService.getContactById(cid);
		model.addAttribute("contact", c);
		return "contactForm";
	}//editContact(-)
	
	/**
	 * method name : deleteContact<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to delete contact from data base<br>
	 *@param request <br>
	 *@return String <br>
	 *created Dec 22nd 2019
	*/
	@RequestMapping(value = "/deleteContact")
	public String deleteContact(HttpServletRequest request,Model model) {
		logger.info("deleteContact() executed"); 
		int cid = Integer.parseInt(request.getParameter("contactId"));
		boolean flag = contactService.deleteContact(cid);
		if(flag) 
			model.addAttribute("delSuccMsg","contact Deleted");
		else
			model.addAttribute("delErrMSg","no contact to delete/ already deleted");
		return "redirect:viewContacts";
	}//deleteContact(-)
	
	/**
	 * method name : addContact<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to add another new Contact to data base<br>
	 *@param model <br>
	 *@return String <br>
	 *created Dec 22nd 2019
	*/
	@RequestMapping(value="/addContact")
	public String addContact(Model model) {
		logger.info("addContact() executed");
		model.addAttribute("contact", new Contact());
		return "contactForm";
	}//addContact(-)
}//class
