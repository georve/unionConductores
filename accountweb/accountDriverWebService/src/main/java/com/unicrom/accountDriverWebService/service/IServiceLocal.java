/**
 * 
 */
package com.unicrom.accountDriverWebService.service;

import com.unicrom.accountDriverWebService.dto.AbstractDto;

/**
 * @author Georman
 *
 */
public interface IServiceLocal <DTO extends AbstractDto> {

    public void create(DTO dto);
}
