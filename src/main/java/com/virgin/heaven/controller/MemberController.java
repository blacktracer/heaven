package com.virgin.heaven.controller;

import com.alibaba.fastjson.JSON;
import com.virgin.heaven.bean.common.Result;
import com.virgin.heaven.bean.vo.MemberVo;
import com.virgin.heaven.service.MemberService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
    private static Logger logger = Logger.getLogger(MemberController.class);
    @Autowired
    private MemberService memberService;

    @GetMapping("/getMember")
    @ResponseBody
    public Result<MemberVo> getMember(){
        MemberVo memberVo = memberService.getMember();
        logger.info(JSON.toJSONString(memberVo));
        return Result.success(memberVo);
    }
}
