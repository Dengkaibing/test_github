package cn.hongmao.controller;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import javax.activation.FileDataSource;
import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/email")
public class EmailController {
	@Resource
	private JavaMailSender javaMailSender;
	
	@Resource
	private TemplateEngine templateEngine;
	/**
	 * 显示发送邮件的页面
	 * @return
	 */
	@GetMapping("/email")
	public String sendEmailPage() {
		return "/email/interviewEmail";
	}
	
	/**
	 * 发送验证码邮件模板
	 * @param code
	 * @return
	 */
	@GetMapping("/code")
	@ResponseBody
	public Object send(String code) {
		Context context = new Context();
		Map<String, Object> variables = new HashMap<>();
		variables.put("code", code);
		context.setVariables(variables);
		String html = templateEngine.process("email/TempCode", context);
		sendHtml("1341992571@qq.com", "duanyuyan@jasonone.cn", html);
		return "发送邮件成功";
	}
	
	/**
	 * 发送简单邮件
	 * @param addresser
	 * @param addressee
	 * @param content
	 * @return
	 */
	@ResponseBody
	@PostMapping("/send")
	public String send(String addresser,String addressee,String content) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(addressee);
		message.setFrom(addresser);
		message.setText(content);
		javaMailSender.send(message);
		return "发送给"+addressee+"成功";
	}
	
	/**
	 * 发送html邮件
	 * @param addresser
	 * @param addressee
	 * @param content
	 * @return
	 */
	@ResponseBody
	@PostMapping(path = "/send",params = "type=html")
	public String sendHtml(String addresser,String addressee,String content) {
		MimeMessage message = javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message,true);
			helper.setTo(addressee);
			helper.setFrom(addresser);
			helper.setText(content, true);
			addInline(helper,"girl","classpath:girl.jpg");
//			addAttachment(helper,"女孩.jpg","classpath:girl.jpg");
			javaMailSender.send(message);
		} catch (MessagingException | FileNotFoundException e) {
			e.printStackTrace();
		}
		return "发送"+addressee+"成功";
	}
	
	private void addInline(MimeMessageHelper helper,String cid,String imgPath) throws MessagingException, FileNotFoundException {
		File file;
		file = ResourceUtils.getFile(imgPath);
		FileDataSource dataSource = new FileDataSource(file);	
		helper.addInline(cid, dataSource);
	}
	
//	private void addAttachment(MimeMessageHelper helper,String attachmentFilename,String filePath) throws FileNotFoundException, MessagingException {
//		File file = ResourceUtils.getFile(filePath);
//		FileDataSource dataSource = new FileDataSource(file);
//		helper.addAttachment(attachmentFilename, dataSource);
//	}
	
}
