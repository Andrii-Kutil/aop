package com.gmail.kutilandrej.advice;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;
import org.aspectj.lang.annotation.AfterReturning;

@Aspect
@Component
@Order(1)
public class OrderAdvice {

  @AfterReturning(pointcut = "execution(* addBook(String))", returning = "result")
  public void afterReturningAddBookAdvice(boolean result) {
    System.out.println("AFTER RETURNING; ORDER 1; OrderAdvice; addBook(String); result=" + result);
  }

  @Around("com.gmail.kutilandrej.advice.MyPointcuts.allGetReturnMethods()")
  public boolean aroundAllMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    System.out.println("AROUND; ORDER 1; allGetReturnMethods(); " + proceedingJoinPoint.toShortString());
    Object o = proceedingJoinPoint.proceed();
    if (o != null) {
      return true;
    }
    return false;
  }
}
