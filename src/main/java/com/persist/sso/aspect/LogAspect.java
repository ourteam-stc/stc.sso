package com.persist.sso.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;


@Aspect //开启切面注解
@Component //组件扫描开启，即spring可以扫描到该类
public class LogAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    //申明该方法为切面方法，execution中的内容是规定拦截那些类,即切面
    @Pointcut("execution(* com.persist.sso.web.*.*(..))")
    public void log(){

    }

    @Before("log()") //该注解是在log（）方法之前执行,即设置切面
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String url = request.getRequestURL().toString();
        String ip = request.getRemoteAddr();
        String classMethod = joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        RequestLog requestLog = new RequestLog(url,ip,classMethod,args);
        logger.info("Requuest : {}",requestLog);
        //logger.info("--------------doBefore-------------");
    }

    @After("log()")
    public void doAfter(){
        logger.error("-------------doAfter-------------");
    }

    @AfterReturning(returning = "result",pointcut = "log()")
    //该注解是在方法返回参数时候执行,即设置切面
    public void doAfterRyturn(Object result){
        logger.error("result : {}",result);
    }

    private class RequestLog{
        private String url;
        private String ip;
        private String classMethod;
        private Object[] args;

        public RequestLog(String url,String ip,String classMethod,Object[] args){
            this.url = url;
            this.ip = ip;
            this.classMethod = classMethod;
            this.args = args;
        }

        @Override
        public String toString() {
            return "RequestLog{" +
                    "url='" + url + '\'' +
                    ", ip='" + ip + '\'' +
                    ", classMethod='" + classMethod + '\'' +
                    ", args=" + Arrays.toString(args) +
                    '}';
        }
    }
}
