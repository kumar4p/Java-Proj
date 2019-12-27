package com.ats.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.bean.Contact;
import com.ats.entity.ContactDetailsEntity;
import com.ats.repository.ContactDetailsRepository;

import ch.qos.logback.classic.Level;

/**
 * class name : ContactServiceImpl<br>
 *@author KUMAR <br>
 *@apiNote This class implemetation class for ContactService(I)<br>
 *has Overriden all the methods of ContactService(I) <br>
 *created Dec 22nd 2019
*/

@Service
public class ContactServiceImpl implements ContactService {
	
	private static final Logger logger = LoggerFactory.getLogger(ContactServiceImpl.class); 
	@Autowired
	private ContactDetailsRepository cntctDetailsRep;
	

	@Override
	public boolean saveContact(Contact c) {
		boolean flag;
		ContactDetailsEntity entity = new ContactDetailsEntity();
		BeanUtils.copyProperties(c, entity);
		entity.setActiveSw("Y");
		entity = cntctDetailsRep.save(entity);
		if(entity.getContactId()>=0)
			flag = true;
		else
			flag = false;
		return flag;
	}//saveContact(-)

	@Override
	public List<Contact> getAllContact() {
		List<Contact> contactList = new ArrayList<>();
		List<ContactDetailsEntity> entityList = cntctDetailsRep.findAll();
		if(!entityList.isEmpty()) {
			entityList = entityList.stream().filter(entity-> "Y".equalsIgnoreCase(entity.getActiveSw())).collect(Collectors.toList());
					
			entityList.forEach(entity->{
			Contact c = new Contact();
			BeanUtils.copyProperties(entity, c);
			contactList.add(c);
			});
		}
		return contactList;
	}//getAllContact()

	@Override
	public Contact getContactById(int cid) {
		Contact c = null;
		Optional<ContactDetailsEntity> optional = cntctDetailsRep.findById(cid);
		if(optional.isPresent()) {
			ContactDetailsEntity entity = optional.get();
			c = new Contact();
			BeanUtils.copyProperties(entity, c);
		}
		return c;
	}//deContactById(-)

	@Override
	public boolean updateContact(Contact c) {
		return false;
	}//updateContact(-)

	@Override
	public boolean deleteContact(int cid) {
		boolean flag;
		try{
			cntctDetailsRep.softDelContactById(cid);
			flag = true;
		}catch (IllegalArgumentException e) {
			flag = false;
			logger.debug(e.getMessage(), Level.DEBUG,e);
		}
		return flag;
	}//deleteContact(-)

}//class
