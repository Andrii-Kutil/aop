package com.gmail.kutilandrej.model;

public interface Library {

  void getBook(String bookName, String person);
  boolean returnBook(String bookName, String person) throws Exception;
  boolean addBook(String bookName);
  void throwMyException();
}
