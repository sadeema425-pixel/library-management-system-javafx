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
public class Item {
    private String title;
    private String code;
    private Date date;

    public Item() {
        date = new Date();
    }

    public Item(String title, String code) {
        this.title = title;
        this.code = code;
        date = new Date();
    }

   protected void setTitle(String title) {
        this.title = title;
    }

   protected String getTitle() {
        return title;
    }

  protected  void setCode(String code) {
        this.code = code;
    }

  protected  String getCode() {
        return code;
    }

   protected Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "The title :" + title + "\ncode: " + code + " \ndate :" + date;
    }
    
}
