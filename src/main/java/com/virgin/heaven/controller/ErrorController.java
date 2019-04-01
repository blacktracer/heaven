package com.virgin.heaven.controller;

import com.virgin.heaven.bean.common.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorController {
    /**
     * 404错误处理
     * @return
     */
    @RequestMapping("/error")
    @ResponseBody
    public Result<String> error(){
        System.out.println("servlet container 404");
        return Result.fail("SYSERROR", "系统错误");
    }
}
