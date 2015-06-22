/**
 * 
 */
package com.unicrom.accountDriverWebModel.user;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.unicrom.accountDriverWebModel.domain.AbstractEntityTest;


/**
 * @author Georman
 *
 */
public class UserTest extends AbstractEntityTest<User> {

    @Override
    public void setParams() {
                entity = new User();
                entity.setName("Amritendu");
                entity.setCustomCode("custom");
                entity.setCreatedBy("ADE");
                entity.setCreatedDt(new Date());
    }

    @Test
    public void testCreate() throws Exception {
                super.testCreate();
                Assert.assertNotNull(entity.getId());
    }

}
