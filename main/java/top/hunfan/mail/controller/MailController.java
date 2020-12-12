package top.hunfan.mail.controller;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.hunfan.mail.domain.R;
import top.hunfan.mail.service.MailSendLogService;
import top.hunfan.mail.service.MailService;

@RestController
public class MailController {
	
	@Autowired
    private MailService service;

    @Autowired
    private MailSendLogService sendLogService;
    
    
	@RequestMapping("/v1/comment/sendMail")//需要提供給前端
	public R sendMail(String to,String content,Date date,String url) {
	/**
	 * 前提：根据@的情况来决定给谁需要发送邮件
	 * 鉴权或者设置 一个开关：确定当项目名称为issue的时候才能进行如下操作
	 * 如果有@才会进行发邮件操作。
	 * 1.@具体人  需要前端将@的个人信息以参数的形式加密发送到后端，后端封装查询相应的
	 * 2.@公司或者@All,需要通过公司id或者all的ID去查询公司下的员工信息，进而查询到员工的邮箱
	 * 3.最终将被@的用户的邮箱、邮件链接以及邮件内容封装成map发送给kafka，由kafka将信息发送到邮件服务发送邮件
	 * 邮件内容要求：账户+时间+在某个话题做了评论/回复
	 * 4.如果发送成功，将状态代码或者其他字段标志烦回给前端。
	 * 
	 * 
	 * 
	 * 邮箱邮件内容 map类型
	 * 
	 * 
	 */
		
		
		return R.success();
		
	}

}
