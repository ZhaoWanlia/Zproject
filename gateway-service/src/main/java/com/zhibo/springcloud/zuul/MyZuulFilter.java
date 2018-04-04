package com.zhibo.springcloud.zuul;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

public class MyZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String loginName = request.getParameter("loginName");
        if(loginName==null || !"admin".equals(loginName)){
            Gson gson = new GsonBuilder().create();
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(500);
            requestContext.addOriginResponseHeader("content-type","application/json;charset=utf-8");
            requestContext.setResponseBody(gson.toJson(new ResponseEntity("no loginName", HttpStatus.CONFLICT)));
            return  null;
        }
        return null;
    }
}
