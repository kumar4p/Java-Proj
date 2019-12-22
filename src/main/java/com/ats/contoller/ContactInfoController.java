package com.ats.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ats.bean.Contact;
import com.ats.service.ContactService;
/**
 * Class name : ContactController<br>
 *@author KUMAR <br>
 *@apiNote This class is to handle request processing logic for Screen "Contact Info" Page
 *created Dec 22nd 2019
*/
@Controller
public class ContactInfoController {
	/**
	 * variable name : service<br>
	 *@author KUMAR <br>
	 *@apiNote This service var holds one of the implementation class of ContactService(I) <br>
	 *created Dec 22nd 2019
	*/
	@Autowired
	private ContactService service;
	/**
	 * method name : displayContactForm<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to display form page on to the browser
	 *@param model <br>
	 *@return String <br>
	 *created Dec 22nd 2019
	*/
	@RequestMapping(value = "/")
	public String displayContactForm(Model model) {
		Contact contact = new Contact();
		//sending data from controller to UI
		model.addAttribute("contact", contact);
		//returning logical view name
		return "contactForm";
	}//displayContactForm(-)
	
	/**
	 * method name : handleSubmitBtn<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to save contact to data base i.e submitted by user in  form by
	 *                    <br> clicking submit button of form page <br>
	 *@param model <br>
	 *@param contact <br>
	 *@return String <br>
	 *created Dec 22nd 2019
	*/
	@RequestMapping(value="/saveContact", method = RequestMethod.POST)
	public String handleSubmitBtn(Model model, Contact contact) {
		return null;
	}//handleSubmitBtn(-,-)
	/**
	 * method name : viewContacts<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to get the all the contacts
	 *@param model <br>
	 *@return String <br>
	 *created Dec 22nd 2019
	*/
	@RequestMapping(value="/seeContacts", method = RequestMethod.GET)
	public String viewContacts(Model model) {
		return null;
	}//viewContact(-)
}//class
