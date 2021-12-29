package com.gmail.kutilandrej.advice;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.AfterThrowing;

@Aspect
@Component
public class ExceptionAdvice {
  @AfterThrowing(pointcut = "execution(* throwMyException())", throwing = "exception")
  public void afterThrowingReturnBookAdviceDuplicate(Throwable exception) {
    System.out.println("AFTER THROWING; ExceptionAdvice; throwMyException()); exception=" + exception.toString());
   }
}
