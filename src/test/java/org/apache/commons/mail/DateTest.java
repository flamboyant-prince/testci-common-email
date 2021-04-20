package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;

public class DateTest {
	
	
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
	public void testDateSets() {
		email.setSentDate(null);
		
	}

}