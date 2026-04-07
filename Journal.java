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
public class Journal extends Item implements Borrowable  {
    
    private String author;
    private String type;
     
    public Journal() {}
   
    public Journal(String title, String author, String code, String type) {
         super(title,code);
          this.type=type;
         this.author=author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    //
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString()+ author + " "  + type + " ";
    }

       @Override
    public void borrow(){
         System.out.println("Journal borrowed ");
     }
    
    @Override
    public void returnBook(){
        System.out.println("Journal returned ");
    }
    
    @Override
    public void dateOfReturn(){
        System.out.println("Return date: "+ new Date());
    }
}
