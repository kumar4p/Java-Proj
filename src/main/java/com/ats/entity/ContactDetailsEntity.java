package com.ats.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * class name : ContactDetailsEntity<br>
 *@author KUMAR <br>
 *@apiNote This class acts as Entity class for storing the data to  data base <br>
 *for this entity class if names and types are matching data base table name and columns
 *then no need of mentioning them other wise we have Mention Explicitly by using @Column 
 *etc kind of annotations for mapping with DataBase table 
 *@param c <br>
 *@return boolean <br>
 *created Dec 22nd 2019
*/
@Entity
@Table(name = "contact_details")
@Data
public class ContactDetailsEntity {
	
	
	/**
	 * variable name : contactId<br>
	 *@author KUMAR <br>
	 *@apiNote This variable holds the Id of contact<br>
	 *this value will be genereted by using Auto Generator
	 *created Dec 22nd 2019
	*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contact_id",length = 6)
	private int contactId;
	
	/**
	 * variable name : contactName<br>
	 *@author KUMAR <br>
	 *@apiNote This variable holds the name of the contact<br>
	 *created Dec 22nd 2019
	*/
	@Column(name = "contact_name", length = 20)
	private String contactName;
	
	/**
	 * variable name : contactEmail<br>
	 *@author KUMAR <br>
	 *@apiNote This variable holds the Email of the contact<br>
	 *created Dec 22nd 2019
	*/
	@Column(name = "contact_email", length = 20)
	private String contactEmail;
	
	/**
	 * variable name : contactEmail<br>
	 *@author KUMAR <br>
	 *@apiNote This variable holds the Phone Number of the contact <br>
	 *created Dec 22nd 2019
	*/
	@Column(name = "contact_number", length = 14)
	private long phNo;

}//class
