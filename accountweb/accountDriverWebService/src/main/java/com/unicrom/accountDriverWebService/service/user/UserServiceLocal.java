/**
 * 
 */
package com.unicrom.accountDriverWebService.service.user;

import javax.ejb.Local;

import com.unicrom.accountDriverWebService.dto.user.UserDto;
import com.unicrom.accountDriverWebService.service.IServiceLocal;

/**
 * @author Georman
 *
 */
@Local
public interface UserServiceLocal extends IServiceLocal<UserDto> {

}
