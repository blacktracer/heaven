package com.virgin.heaven;

import com.virgin.heaven.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringContextConfig.class);
        MemberService memberService = applicationContext.getBean("memberServiceImpl", MemberService.class);
        System.out.println(memberService);
    }
}
