package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailTest {
	
	private static final String[] TEST_EMAILS = {"bababa@banana.com", "a.b@c.org", "blam@jam.com.bd", "asdfghjklzxcvbnm@qwertyuiop.net", "1234567890@1234567890.com"};
	private static final String[] TEST_EMULLS = {null};
	private EmailConcrete email;
	private EmailConcrete emull;
	@Before
	public void  setUpEmailTest() throws Exception
	{
		email = new EmailConcrete();
		emull = new EmailConcrete();
		
	}
	@After
	public void tearDownEmailTest() throws Exception
	{
		
	
	}
	
	@Test
	public void testAddBcc() throws Exception
	{
		email.addBcc(TEST_EMAILS);
		assertEquals(5,email.getBccAddresses().size());
	}
	
@Test
	public void testAddBccwithNull() throws Exception
	{
		emull.addBcc(TEST_EMULLS);
		assertEquals(0,email.getBccAddresses().size());
		
	}
}
