package Day48发送邮件2;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailDemo {
	public static void main(String[] args) {
		//先登录上QQ邮箱服务器
		String to = "225@qq.com";
		String from = "12@qq.com";
		//创建会话之前，设置一些参数
		Properties properties = new Properties();
		//设置邮件服务器，并设置key和value
		properties.setProperty("mail.host", "smtp.qq.com");
		properties.setProperty("mail.transport.protocol", "smtp");
		properties.put("mail.smtp.auth","true");//通过服务器的认证
		//会话
		Session session = Session.getDefaultInstance(properties,new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("128@qq.com","ro");
			}
		});
		//准备一封邮件（收件人，主题，正文）
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(from));
			//Message.RecipientType.TO 表示收件人
			//Message.RecipientType.CC 表示抄送
			//Message.RecipientType.BCC 表示暗送
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("这是主题");
			message.setText("这是内容");
			//发送邮件
			Transport.send(message);
			System.out.println("邮件传输成功");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
