package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCc {
	
	private static final String[] TEST_EMAILS = {"bababa@banana.com", "a.b@c.org", "blam@jam.com.bd", "asdfghjklzxcvbnm@qwertyuiop.net", "1234567890@1234567890.com"};

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
	public void testAddCc() throws Exception
	{
		email.addCc(TEST_EMAILS);
		assertEquals(5,email.getCcAddresses().size());
	}
}

