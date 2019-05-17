package com.scala.autoTest.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.scala.autoTest.base.EmailUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:
 * @date: 2018/8/8
 * @description:
 */
@RestController
public class SendEmail {

    @RequestMapping("/sendEmail")
    public String sendEmail() throws JsonProcessingException {
        boolean isSend = EmailUtils.sendEmail("这是一封测试邮件", new String[]{"downline@yeah.net"}, null, "test-output//index.html", null);
        return "发送邮件:" + isSend;
    }
}