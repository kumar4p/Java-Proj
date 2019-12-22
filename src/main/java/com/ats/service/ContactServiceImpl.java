package com.ats.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ats.bean.Contact;
import com.ats.repository.ContactDetailsRepository;

/**
 * class name : ContactServiceImpl<br>
 *@author KUMAR <br>
 *@apiNote This class implemetation class for ContactService(I)<br>
 *has Overriden all the methods of ContactService(I) <br>
 *created Dec 22nd 2019
*/
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactDetailsRepository repository;
	

	@Override
	public boolean saveContact(Contact c) {
		// TODO Auto-generated method stub
		return false;
	}//saveContact(-)

	@Override
	public List<Contact> getAllContact() {
		// TODO Auto-generated method stub
		return null;
	}//getAllContact()

	@Override
	public Contact getContactById(int cid) {
		// TODO Auto-generated method stub
		return null;
	}//deContactById(-)

	@Override
	public boolean updateContact(Contact c) {
		// TODO Auto-generated method stub
		return false;
	}//updateContact(-)

	@Override
	public boolean deleteContact(int cid) {
		// TODO Auto-generated method stub
		return false;
	}//deleteContact(-)

}//class
