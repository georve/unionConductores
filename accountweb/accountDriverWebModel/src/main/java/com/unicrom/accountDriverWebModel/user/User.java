/**
 * 
 */
package com.unicrom.accountDriverWebModel.user;

import javax.persistence.Entity;

import com.unicrom.accountDriverWebModel.domain.AbstractPersistentObject;


/**
 * @author Georman
 *
 */
@Entity
public class User extends AbstractPersistentObject {
	
	private static final long serialVersionUID = 1L;

    private String name;
    
    private String password;

    public String getName() {
                return name;
    }

    public void setName(String name) {
                this.name = name;
    }

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
