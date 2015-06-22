package com.unicrom.accountWebPersistence.user;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.unicrom.accountDriverWebModel.user.User;
import com.unicrom.accountDriverWebPersistence.user.*;
import com.unicrom.accountWebPersistence.persistence.AbstractRepositoryImplTest;

public class UserRepositoryImplTest extends AbstractRepositoryImplTest<UsersRepositoryLocal, User>{

	
	@Test
    public void testCreate() {
                super.testCreate();
                Assert.assertNotNull(bo.getId());
    }

    @Override
    public void setParams() {
                bo = new User();
                bo.setName("Amritendu");
                bo.setCreatedDt(new Date());
                bo.setCreatedBy("ADE");
                bo.setName("georman calderon");
                bo.setPassword("password");
    }
}
