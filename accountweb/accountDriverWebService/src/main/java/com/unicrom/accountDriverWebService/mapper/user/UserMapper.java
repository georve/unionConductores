/**
 * 
 */
package com.unicrom.accountDriverWebService.mapper.user;

import com.unicrom.accountDriverWebModel.user.User;
import com.unicrom.accountDriverWebService.dto.user.UserDto;
import com.unicrom.accountDriverWebService.mapper.AbstractMapper;

/**
 * @author Georman
 *
 */
public class UserMapper extends AbstractMapper<UserDto,User> {

    public User mapDtoToEntity(UserDto userDto) {
                User person = new User();
                person.setCreatedBy(userDto.getCreatedBy());
                person.setCreatedDt(userDto.getCreatedDate());
                person.setName(userDto.getName());
                return person;
    }
}
