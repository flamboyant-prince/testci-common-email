package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Session;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HostNameTest {
	
	private static final String[] TEST_EMAILS = {"bababa@banana.com", "a.b@c.org", "blam@jam.com.bd", "asdfghjklzxcvbnm@qwertyuiop.net", "1234567890@1234567890.com"};
	private EmailConcrete email;
	@Before
	public void  setUpEmailTest() throws Exception
	{
		email = new EmailConcrete();
		
	}
	
	
	@Test
	public void testgetHostName() 
	{
		email.setHostName("192.127.0.1");
		String hostname = email.getHostName();
		assertEquals("192.127.0.1", hostname);
	}
	@Test
	public void testgetHostNamewithNull() 
	{
		email.setHostName(null);
		assertEquals(null, email.getHostName());
	}
	@Test
	public void testGetSetHostNameWithSession(){
		final String username = "username@gmail.com";
		final String  passwords = "password";
		
		Properties props = new Properties();
		props.put(EmailConstants.MAIL_SMTP_AUTH, "true");
		props.put(EmailConstants.MAIL_HOST, "smtp.gmail.com");
		props.put(EmailConstants.MAIL_PORT, "587");
		props.put(EmailConstants.MAIL_SMTP_USER, "username@gmail.com");
		props.put(EmailConstants.MAIL_SMTP_PASSWORD, "password");
		
		Session session = Session.getDefaultInstance(props,null);
		email.setMailSession(session);
		//email.setHostName("localhost");
		assertEquals("smtp.gmail.com", email.getHostName());
	}
}//i followed the class lecture closely for this one
//i dont know why the authentication thing didnt work but good thing prof went over the easier one
//i was so mad pssh
