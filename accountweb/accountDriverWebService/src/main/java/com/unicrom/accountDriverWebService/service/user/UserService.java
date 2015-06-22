/**
 * 
 */
package com.unicrom.accountDriverWebService.service.user;
import com.unicrom.accountDriverWebService.dto.user.*;
import com.unicrom.accountDriverWebService.mapper.user.*;
import com.unicrom.accountDriverWebService.service.AbstractService;
import com.unicrom.accountDriverWebPersistence.user.*;
/**
 * @author Georman
 *
 */
public class UserService extends AbstractService<UserRepositoryLocal, UserDto, UserMapper> implements UserServiceLocal {

    @Override
    public void setDao(UserRepositoryLocal dao) {
                this.dao = dao;
    }

    @Override
    public void setMapper() {
                mapper = new UserMapper();
    }

	
}
