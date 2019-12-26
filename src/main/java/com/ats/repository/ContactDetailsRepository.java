package com.ats.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

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
@Repository
public interface ContactDetailsRepository extends JpaRepository<ContactDetailsEntity, Integer>{
	@Transactional
	@Modifying
	@Query("update ContactDetailsEntity set activeSw='N' where contactId=:cid")
	public void softDelContactById(int cid);
}
