/**
 * 
 */
package com.unicrom.accountDriverWebPersistence.user;

import javax.ejb.Local;

import com.unicrom.accountDriverWebModel.user.User;
import com.unicrom.accountDriverWebPersistence.persistence.IRepositoryLocal;



/**
 * @author Georman
 *
 */
@Local
public interface UserRepositoryLocal extends IRepositoryLocal<User> {

}
