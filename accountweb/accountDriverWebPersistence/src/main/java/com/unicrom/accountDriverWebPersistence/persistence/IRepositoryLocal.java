package com.unicrom.accountDriverWebPersistence.persistence;

import java.util.List;

import com.unicrom.accountDriverWebModel.domain.AbstractPersistentObject;



public interface IRepositoryLocal <T extends AbstractPersistentObject> {
    
    public void insert(T t);
    
    public T update(T t);
    
    /*public void delete(T t);
    
    public void deleteById(Long id);
    
    public T findOneById(Long id);
    
    public List<T> findAll();
    
    public T findOneByCustomCode(String customCode);*/
    
    
}
