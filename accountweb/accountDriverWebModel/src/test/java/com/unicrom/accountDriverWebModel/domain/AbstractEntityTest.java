/**
 * 
 */
package com.unicrom.accountDriverWebModel.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

/**
 * @author Georman
 *
 */
public abstract class AbstractEntityTest<T extends AbstractPersistentObject> {

	
	 protected static final String PERSISTENCE_UNIT_NAME = "Persistence";
     protected static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
     protected EntityManager em = factory.createEntityManager();
    
     protected T entity;
    
     @Test
     public void testCreate() throws Exception {
                 em.getTransaction().begin();
                 setParams();
                 em.persist(entity);
                 em.getTransaction().commit();
     }
    
     public abstract void setParams();
}
