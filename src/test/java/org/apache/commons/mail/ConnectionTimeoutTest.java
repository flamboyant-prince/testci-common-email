package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ConnectionTimeoutTest {
	
	
	private EmailConcrete email;


	@Before
	public void  setUpEmailTest() throws Exception
	{
		email = new EmailConcrete();
	}
	@After
	public void tearDownEmailTest() throws Exception
	{
		
	}
	
	@Test
	public void replyTester() throws Exception
	{
		email.setSocketConnectionTimeout(6);
	}
}