package com.gmail.kutilandrej.model;

import org.springframework.stereotype.Component;

@Component("schoolLibrary")
public class SchoolLibrary implements Library {

  @Override
  public void getBook(String bookName, String person) {
    System.out.println("\t\tEXEC SchoolLibrary; getBook(String bookName, String person);");
  }

  @Override
  public boolean returnBook(String bookName, String person) throws Exception {
    System.out.println("\t\tEXEC SchoolLibrary; returnBook(String bookName, String person);");
    throw new Exception("SchoolLibrary; returnBook(String bookName, String person)");

  }

  @Override
  public boolean addBook(String bookName) {
    System.out.println("\t\tEXEC SchoolLibrary; addBook(String);");
    return true;
  }

  public void throwMyException() {
    System.out.println("\t\tEXEC SchoolLibrary; throwException();");
    throw new NullPointerException();
  }
}
