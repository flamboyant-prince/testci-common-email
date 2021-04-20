package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHeader {
	
	
	private EmailConcrete email;
	private EmailConcrete emull;
	private EmailConcrete emaul;
	@Before
	public void  setUpEmailTest() throws Exception
	{
		email = new EmailConcrete();	
		emull = new EmailConcrete();
		emaul = new EmailConcrete();
	}
	@After
	public void tearDownEmailTest() throws Exception
	{
		
	}
	
	@Test
	public void testHeader() {
		email.addHeader("bazinga", "plain");
		emull.addHeader("", "plain");
		emaul.addHeader("bazinga", "");
	}

}

