/**
 * 
 */
package com.unicrom.accountDriverWebService.service;

import javax.ejb.EJB;

import com.unicrom.accountDriverWebPersistence.persistence.IRepositoryLocal;
import com.unicrom.accountDriverWebService.dto.AbstractDto;
import com.unicrom.accountDriverWebService.mapper.AbstractMapper;

/**
 * @author Georman
 *
 */
public abstract class AbstractService <DAO extends IRepositoryLocal, DTO extends AbstractDto, MAP extends AbstractMapper> {
    
    @EJB
    protected DAO dao;
   
    protected MAP mapper;
   
    public abstract void setDao(DAO dao);
   
    public abstract void setMapper();
   
    public void create(DTO dto) {
                setMapper();
                dao.insert(mapper.mapDtoToEntity(dto));
    }
}
