/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

import java.util.Date;

/**
 *
 * @author sadeem
 */
public class Book extends Item implements Borrowable{
  
    private String author;
    private static int number;
    public Book() {
        number++;
    }

    public Book(String title, String author, String code) {
        super(title, code);
        this.author = author;

        number++;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    String getAuthor() {
        return author;
    }

    static int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return super.toString() + "\nauthor :" + author;
    }

    @Override
    public void borrow() {
        System.out.println("Book borrowed ");
    }

    @Override
    public void returnBook() {
        System.out.println("Book returned ");
    }

    @Override
    public void dateOfReturn() {
        System.out.println("Return date: " + new Date());
    }
}
