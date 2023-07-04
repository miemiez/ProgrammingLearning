package Day48发送邮件2;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class 发送带有附件的邮件 {
	public static void main(String[] args) throws IOException {
		String to = "2259478576@qq.com";
		String from = "1285291486@qq.com";
		
		Properties pros = new Properties();
		pros.setProperty("mail.host","smtp.qq.com");
		pros.setProperty("mail.transport.protocol","smtp");
		pros.put("mail.smtp.auth", "true");
		
		Session session = Session.getDefaultInstance(pros,new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("1285291486","tllcqqzqinrfjfgc");
			}
		});//让Session（会话）对象，连接到发送邮件的主机（smtp.qq.com），并且登陆上账号（qq邮箱地址）和密码（qq邮箱授权码）
		
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			message.setSubject("这是主题");
			
			//可以装载多个主体部件，可以把它当成一个集合（一个MimeMessage对应一个MimeMultipart，一个MimeMultipart可以有多个MimeBodyPart）
			MimeMultipart partList = new MimeMultipart();
			message.setContent(partList);//把邮件的内容设置为多部件的集合对象
			
			//创建并添加第一个主体部件
			MimeBodyPart part1 = new MimeBodyPart();
			part1.setContent("这是主体内容1：请你给出附件中传入图片的回答","text/html;charset=utf-8");
			partList.addBodyPart(part1);
			
			//创建并添加第二个主体部件（附件）
			MimeBodyPart part2 = new MimeBodyPart();
			part2.attachFile(new File("E:/JAVAIO/File01/picture.jpg"));//添加要发送的文件
			part2.setFileName("picture1.jpg");//指定附件文件的名称（也可以使用MimeUtility.encodeText("图片1.jpg");对中文进行编码）
			partList.addBodyPart(part2);
			
			Transport.send(message);;
			System.out.println("邮件发送成功");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
