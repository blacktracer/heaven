package com.virgin.heaven.exception;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class HeavenHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ex.printStackTrace();
        ModelAndView modelAndView = new ModelAndView(new FastJsonJsonView());
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("status", false);
        resultMap.put("code", "SYSERROR");
        resultMap.put("msg", "系统错误");
        modelAndView.addAllObjects(resultMap);
        return modelAndView;
    }
}
