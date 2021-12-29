package com.gmail.kutilandrej.advice;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

  @Pointcut("execution(* getBook(String,String))")
  public void allGetMethods() {}

  @Pointcut("execution(* returnBook(String,String))")
  public void allReturnMethods() {}

  @Pointcut("allGetMethods() || allReturnMethods()")
  public void allGetReturnMethods() {}
}
