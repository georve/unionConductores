/**
 * 
 */
package com.unicrom.accountDriverWebPersistence.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.unicrom.accountDriverWebModel.domain.AbstractPersistentObject;



/**
 * @author Georman
 *
 */
public abstract class AbstractRepository <T extends AbstractPersistentObject> {

    @PersistenceContext
    EntityManager em;
   
    public void insert(T t) {
         em.persist(t);      
    }
    
    public T update(T t){
       return em.merge(t);
    }
    

    
    
    
   
}