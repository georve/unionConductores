/**
 * 
 */
package com.unicrom.accountDriverWebService.dto.user;

import com.unicrom.accountDriverWebService.dto.AbstractDto;

/**
 * @author Georman
 *
 */
public class UserDto extends AbstractDto {

    protected String name;
    
    protected String password;
   

	/**
     * @return the name
     */
    public String getName() {
                return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
                this.name = name;
    }
    
    public String getPassword() {
		return password;
	}
    
	public void setPassword(String password) {
		this.password = password;
	}
}
