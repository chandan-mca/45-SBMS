package in.ashokit.service.impl;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import in.ashokit.service.EmailService;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendEmail1(String subject, String body, String to) {
		try {
			SimpleMailMessage msg = new SimpleMailMessage();
			msg.setSubject(subject);
			msg.setText(body);
			msg.setTo(to);
			javaMailSender.send(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sendEmail2(String subject, String body, String to) {
		try {

			MimeMessage mimeMessage = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

			helper.setSubject(subject);
			helper.setText(body, true);
			helper.setTo(to);

			helper.addAttachment("Notes", new File("C:\\Users\\cagra\\Downloads\\TODO.txt"));

			javaMailSender.send(mimeMessage);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
