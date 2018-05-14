package com.unideb.user.service.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import javax.persistence.NoResultException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.unideb.prtprk.service.IUserService;

/**
 * UserServiceTest class.
 * @author gagyi.norbert
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = com.unideb.prtprk.Main.class)
// @ContextConfiguration
@ComponentScan({ "com.unideb.prtprk.*" })
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserServiceTest {

	/**
	 * userService interface injected.
	 */
	@Autowired
	IUserService userService;
	

	
	/**
	 * test fake username and password.
	 */
	@Test(expected = NoResultException.class)
	public void userLogInWithUsernameAndPassowrdTest01() {
		assertTrue(userService.userLogInWithUsernameAndPassowrd("fakeFoo", "fake") );
	}
}
