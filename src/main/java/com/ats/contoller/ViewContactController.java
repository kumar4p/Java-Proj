package com.ats.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ats.service.ContactService;

/**
 * Class name : ViewContactController<br>
 *@author KUMAR <br>
 *@apiNote This class is to handle request processing logic for Screen "All Contact" Page
 *created Dec 22nd 2019
*/
@Controller
public class ViewContactController {
	
	/**
	 * variable name : service<br>
	 *@author KUMAR <br>
	 *@apiNote This service var holds one of the implementation class of ContactService(I)<br> <br>
	 *created Dec 22nd 2019
	*/
	@Autowired
	private ContactService service;
	
	/**
	 * method name : editContact<br>
	 *@author KUMAR <br>
	 *@apiNote This method is to handle incoming request to display form page with all ready available data for update contact details<br>
	 *@param model <br>
	 *@return String <br>
	 *created Dec 22nd 2019
	*/
	@RequestMapping(value = "/editContact", method = RequestMethod.GET)
	public String editContact(Model model) {
		return null;
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
	public String deleteContact(HttpRequest request) {
		return null;
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
		return null;
	}//addContact(-)
}//class
