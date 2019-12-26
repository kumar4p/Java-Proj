package com.ats.bean;

import lombok.Data;

/**
 * class name : Contact<br>
 *@author KUMAR <br>
 *@apiNote This class acts as command class / Form Bean class for representing form data<br>
 *@param c <br>
 *@return boolean <br>
 *created Dec 22nd 2019
*/
@Data
public class Contact {
	/**
	 * variable name : contactId<br>
	 *@author KUMAR <br>
	 *@apiNote This variable represents the id of contact <br>
	 *This variable value will not be read from FORM page It is used for displaying purpose
	 *created Dec 22nd 2019
	*/
	private int contactId;
	
	/**
	 * variable name : contactName<br>
	 *@author KUMAR <br>
	 *@apiNote This variable holds the name of the contact of form page<br>
	 *created Dec 22nd 2019
	*/
	private String contactName;
	
	/**
	 * variable name : contactEmail<br>
	 *@author KUMAR <br>
	 *@apiNote This variable holds the Email of the contact of form page<br>
	 *created Dec 22nd 2019
	*/
	private String contactEmail;
	
	/**
	 * variable name : contactEmail<br>
	 *@author KUMAR <br>
	 *@apiNote This variable holds the Phone Number of the contact of form page<br>
	 *created Dec 22nd 2019
	*/
	private Long phNo;

	private String activeSw;
}//class
