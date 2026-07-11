package com.library.exercise3.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.exercise3.service.BookService.*(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("Logging before method : "
                + joinPoint.getSignature().getName());

    }

}