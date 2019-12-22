package com.ats.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ats.entity.ContactDetailsEntity;

/**
 * class name : ContactDetailsRepository<br>
 *@author KUMAR <br>
 *@apiNote This ContactDetailsRepository(I) extends from JpaRepository(I)<br>
 *so we no need to write any code for basic CRUD operations spring data only supplies
 *those logics, if we customized queries then we have to write our own methods 
 *@param c <br>
 *@return boolean <br>
 *created Dec 22nd 2019
*/
public interface ContactDetailsRepository extends JpaRepository<ContactDetailsEntity, Integer>{

}
