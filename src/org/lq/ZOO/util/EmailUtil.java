package org.lq.ZOO.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

public class EmailUtil {
	
	private static Session session=null;
	private static Properties props=null;
	static {
		props = PropsUtil.loadProps("email.properties");
		session = Session.getInstance(props);
		session.setDebug(Boolean.parseBoolean(props.getProperty("mail.debug")));
	}
	
	
	
	public static void sendEmail() {
		try {
			Transport ts = session.getTransport();
			
			ts.connect(props.getProperty("mail.username"),props.getProperty("mail.password"));
			
			Message msg = null;
			
			ts.sendMessage(msg, msg.getAllRecipients());
			ts.close();
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static MimeMessage createMessage() {
		
		MimeMessage message = new MimeMessage(session);
		
		
		return message;
	}
	
	
	
	
	

}
