/**
 * 
 */
package com.unicrom.accountDriverWebService.mapper;

import com.unicrom.accountDriverWebModel.domain.AbstractPersistentObject;
import com.unicrom.accountDriverWebService.dto.AbstractDto;

/**
 * @author Georman
 *
 */
public abstract class AbstractMapper <DTO extends AbstractDto, BO extends AbstractPersistentObject> {

    public abstract BO mapDtoToEntity(DTO dto);
}
