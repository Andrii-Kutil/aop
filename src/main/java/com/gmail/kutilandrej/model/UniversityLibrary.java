package com.gmail.kutilandrej.model;

import org.springframework.stereotype.Component;

@Component("universityLibrary")
public class UniversityLibrary implements Library {

  @Override
  public void getBook(String bookName, String person) {
    System.out.println("\t\tEXEC UniversityLibrary; getBook(String bookName, String person);");
  }

  @Override
  public boolean returnBook(String bookName, String person) throws Exception {
    System.out.println("\t\tEXEC UniversityLibrary; returnBook(String bookName, String person);");
    throw new Exception("UniversityLibrary; returnBook(String bookName, String person)");
  }

  @Override
  public boolean addBook(String bookName) {
    System.out.println("\t\tEXEC UniversityLibrary; addBook(String);");
    return true;
  }

  @Override
  public void throwMyException() {
    System.out.println("\t\tEXEC UniversityLibrary; throwException();");
    throw new NullPointerException();
  }
}
