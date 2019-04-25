package com.virgin.heaven.util;

import com.alibaba.fastjson.JSON;
import com.virgin.heaven.bean.vo.MemberVo;
import com.virgin.heaven.config.DataConfig;
import com.virgin.heaven.service.MemberService;
import com.virgin.heaven.service.impl.MemberServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBatisUtil {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
                DataConfig.class, MemberServiceImpl.class);
        MemberService memberService = annotationConfigApplicationContext.getBean(MemberService.class);
        System.out.println(memberService);
        MemberVo memberVo = memberService.getMember();
        System.out.println(JSON.toJSONString(memberVo));
    }
}
