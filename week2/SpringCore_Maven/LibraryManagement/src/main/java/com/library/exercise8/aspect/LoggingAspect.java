package com.library.exercise8.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.exercise8.service.BookService.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {

        System.out.println("Before executing : "
                + joinPoint.getSignature().getName());

    }

    @After("execution(* com.library.exercise8.service.BookService.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {

        System.out.println("After executing : "
                + joinPoint.getSignature().getName());

    }

}