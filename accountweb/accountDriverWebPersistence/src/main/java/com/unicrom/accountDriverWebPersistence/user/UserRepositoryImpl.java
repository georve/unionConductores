/**
 * 
 */
package com.unicrom.accountDriverWebPersistence.user;

import java.util.List;

import javax.ejb.Stateless;

import com.unicrom.accountDriverWebModel.user.User;
import com.unicrom.accountDriverWebPersistence.persistence.AbstractRepository;

/**
 * @author Georman
 *
 */
@Stateless(mappedName = "user-repository-ejb")
public class UserRepositoryImpl extends AbstractRepository<User> implements
		UsersRepositoryLocal {



}
