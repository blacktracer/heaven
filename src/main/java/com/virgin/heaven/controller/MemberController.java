package com.virgin.heaven.controller;

import com.virgin.heaven.bean.common.Result;
import com.virgin.heaven.bean.vo.MemberVo;
import com.virgin.heaven.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private RedisTemplate redisTemplate;
    @GetMapping("/getMember")
    @ResponseBody
    public Result<MemberVo> getMember(){
     /*   redisTemplate.opsForValue().set("name", "lucy");
        System.out.println(redisTemplate.opsForValue().get("name"));*/
        MemberVo memberVo = memberService.getMember();
        return Result.success(memberVo);
    }
}
