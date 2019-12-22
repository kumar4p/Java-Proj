package com.ats.service;

import java.util.List;

import com.ats.bean.Contact;

/**
 * interface name : ContactService<br>
 *@author KUMAR <br>
 *@apiNote This Interface is super class for  service layer componenets where it
 *communicate with Repository and Controller layer components 
 *created Dec 22nd 2019
*/
public interface ContactService {
	/**
	 * method name : saveContact<br>
	 *@author KUMAR <br>
	 *@apiNote This method is for saving contact to data base<br>
	 *@param c <br>
	 *@return boolean <br>
	 *created Dec 22nd 2019
	*/
	public boolean saveContact(Contact c);
	
	/**
	 * method name : getAllContact<br>
	 *@author KUMAR <br>
	 *@apiNote This method is for getting all contact from data base<br>
	 *@return <![CDATA[List<Contact>]]> <br>
	 *created Dec 22nd 2019
	*/
	public List<Contact> getAllContact();
	
	/**
	 * method name : getContactById<br>
	 *@author KUMAR <br>
	 *@apiNote This method is for getting contact from data base<br>
	 *@param cid <br>
	 *@return Contact <br>
	 *created Dec 22nd 2019
	*/
	public Contact getContactById(int cid);
	
	/**
	 * method name : updateContact<br>
	 *@author KUMAR <br>
	 *@apiNote This method is for updating contact to data base<br>
	 *@param c <br>
	 *@return boolean <br>
	 *created Dec 22nd 2019
	*/
	public boolean updateContact(Contact c);
	
	/**
	 * method name : deleteContact<br>
	 *@author KUMAR <br>
	 *@apiNote This method is for deleting contact from data base<br>
	 *@param cid <br>
	 *@return boolean <br>
	 *created Dec 22nd 2019
	*/
	public boolean deleteContact(int cid); 
}
