package com.ats.contoller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	private static final Logger logger = LoggerFactory.getLogger(ContactInfoController.class);
	
	/**
	 * variable name : service<br>
	 *@author KUMAR <br>
	 *@apiNote This service var holds one of the implementation class of ContactService(I) <br>
	 *created Dec 22nd 2019
	*/
	@Autowired
	private ContactService cntctService;
	
	
	/**
	 * method name : displayContactForm<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to display form page on to the browser
	 *@param model <br>
	 *@return String <br>
	 *created Dec 22nd 2019
	*/
	@RequestMapping(value = {"/","contactForm"}, method=RequestMethod.GET)
	public String displayContactForm(Model model) {
		logger.info("from displayContactForm()");
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
	public String handleSubmitBtn(@ModelAttribute(value = "contact") Contact contact,RedirectAttributes redirectAttr) {
		
		logger.info("contact form submitted "+ contact);
		boolean flag = cntctService.saveContact(contact);
		
		if(flag)
			redirectAttr.addFlashAttribute("succMsg","Contact Saved");
		else
			redirectAttr.addFlashAttribute("errMsg","contact Not Saved");
		return "redirect:/contactCreationSuccess";
	}//handleSubmitBtn(-,-)
	
	/**
	 * method name : contactCreationSuccess<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle double posting problem developed on basis of PRG design pattern
	 *@return String <br>
	 *created Dec 22nd 2019
	*/
	@RequestMapping(value ="/contactCreationSuccess", method = RequestMethod.GET)
	public String contactCreationSuccess(Model model) {
		logger.info("contactCreationSuccess() form re-submitted");
		model.addAttribute("contact", new Contact());
		return "contactForm";
	}//contactCreationSuccess()
	
	/**
	 * method name : viewContacts<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to get the all the contacts
	 *@param model <br>
	 *@return String <br>
	 *created Dec 22nd 2019
	*/

	@RequestMapping(value="/viewContacts", method = RequestMethod.GET)
	public String viewContacts(Model model) {
		logger.info("viewContacts() executed"); 
		List<Contact> contactList = cntctService.getAllContact();
		if(contactList!=null)
			model.addAttribute("contactList", contactList);
		return "viewContacts";
	}//viewContact(-)
}//class
