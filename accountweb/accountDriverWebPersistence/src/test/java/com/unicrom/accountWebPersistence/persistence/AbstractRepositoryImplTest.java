/**
 * 
 */
package com.unicrom.accountWebPersistence.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.unicrom.accountDriverWebModel.domain.AbstractPersistentObject;
import com.unicrom.accountDriverWebPersistence.persistence.IRepositoryLocal;

/**
 * @author Georman
 *
 */
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = { "classpath:context.xml" } )
@TransactionConfiguration( defaultRollback = true )
@Transactional
public abstract class AbstractRepositoryImplTest<DAO extends IRepositoryLocal<BO>, BO extends AbstractPersistentObject> {
	
	@Autowired
    protected ApplicationContext applicationContext;
      
    @Autowired
    protected DAO local;
   
    protected BO bo;
   
    @Test
    public void testCreate() {
                setParams();
                local.insert(bo);
    }
   
    public abstract void setParams();

}
