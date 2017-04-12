
package com.warehouse.sellercube.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Created by chenjing on 2017/4/12.
 */

@Component
@Aspect
public class LogRecord {
    private Logger logger = LoggerFactory.getLogger(LogRecord.class);

    ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(public * com.warehouse.sellercube.rest.*.*(..))")
    public void log(){}


    @Before("log()")
    public void before(JoinPoint joinPoint)throws Exception{
        startTime.set(System.currentTimeMillis());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("request url=> : " + request.getRequestURL().toString());
        logger.info("http_method=> : " + request.getMethod());
        logger.info("IP=> : " + request.getRemoteAddr());
        logger.info("class_method=> : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("args=> : " + Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "ret", pointcut = "log()")
    public void doAfterReturning(Object ret) throws Throwable {
        logger.info("result=> : " + ret);
        logger.info("spend time=> : " + (System.currentTimeMillis() - startTime.get())+" milliseconds");
    }
}

