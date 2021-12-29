package com.gmail.kutilandrej;

import com.gmail.kutilandrej.config.MyConfig;
import com.gmail.kutilandrej.model.Library;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    Library schoolLibrary = context.getBean("schoolLibrary", Library.class);
    schoolLibrary.getBook("Harry Potter and the Philosopher's Stone", "Andrii");
    schoolLibrary.addBook("The Little Prince");
    try {
      schoolLibrary.returnBook("Harry Potter and the Philosopher's Stone", "Andrii");
    } catch (Exception e) {
      System.out.println(e);
    }

    try {
      schoolLibrary.throwMyException();
    } catch (Exception e) {
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    Library universityLibrary = context.getBean("universityLibrary", Library.class);
    universityLibrary.getBook("The Hobbit", "Misterio");
    universityLibrary.addBook("War Stories");
    try {
      universityLibrary.returnBook("The Hobbit", "Misterio");
    } catch (Exception e) {
      System.out.println(e);
    }

    try {
      universityLibrary.throwMyException();
    } catch (Exception e) {
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
    context.close();
  }
}
