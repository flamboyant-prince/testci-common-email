package org.apache.commons.mail;

import org.junit.Before;
import org.junit.Test;

public class MimeTest {
	private EmailConcrete email;
	private EmailConcrete emull;
	@Before
	public void  setUpEmailTest() throws Exception
	{
		email = new EmailConcrete();
		emull = new EmailConcrete();
	}
	
@Test (expected = EmailException.class)
public void testbuildMimemessage()throws EmailException
{	
	email.setHostName("localhost");
	email.setSmtpPort(1234);
	email.setFrom("chickenbreast@gmail.com");
	email.addTo("chickentenders@gmail.com");
	email.setSubject("test mail");
	
	email.setCharset("ISO-8859-1");
	email.setContent("test content", "text/plain");
	email.addCc("test@abc.com");
	email.addBcc("cob@boch.com");
	email.addHeader("oomf", "abc");
	
	email.addReplyTo("soup@clothes.com");
	email.setPopBeforeSmtp(true, "localhost", "nocalhost", "assword");
	
	email.buildMimeMessage();
	

	
	
}
	
	
}
