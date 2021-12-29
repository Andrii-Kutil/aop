package com.gmail.kutilandrej.advice;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAdvice {
  //@Before("execution(public void getBook())")
  //@Before("execution(public void get*())")
  //@Before("execution(public * get*())")
  //@Before("execution(public void aop.Library.getBook(String))")
  //@Before("execution(public void aop.Library.getBook(*))")
  //@Before("execution(public void aop.Library.getBook(..))")
  //@Before("execution(public void aop.Library.getBook(aop.Book))")
  //@Before("execution(public void aop.Library.getBook(aop.Book, ..))")
  //@Before("allGetMethods() || allGetMethods()")
  //@Before("allGetMethods() && !methods()") исключить что то
  @After("com.gmail.kutilandrej.advice.MyPointcuts.allGetMethods()")
  public void afterAllGetReturnMethodsAdvice() {
    System.out.println("AFTER; SampleAdvice; allGetMethods();");
  }

  @Before("com.gmail.kutilandrej.advice.MyPointcuts.allReturnMethods()")
  public void beforeAllGetMethodsAdviceDuplicate(JoinPoint joinPoint) {
    System.out.println("BEFORE JOIN POINT; SampleAdvice; allReturnMethods(); " + Arrays.toString(joinPoint.getArgs()));
  }
}
