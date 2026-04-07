/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

import java.util.ArrayList;

/**
 *
 * @author sadeem
 */
public class Librarian extends Person{
     
       private ArrayList<Item> myArray;

    public Librarian() {
        myArray = new ArrayList<>();
    }
     public Librarian(String name, int id) {
        super(name, id);
         myArray = new ArrayList<>();}

   public  void addItem(Item item) {
        myArray.add(item);
    }

    public void removeItem(Item item) {
        myArray.remove(item);
    }

   public  ArrayList<Item> getItems() {
        return myArray;
    }

    public Item searchByCode(String code) {
        for (Item item : myArray) {
            if ((item.getCode()).equalsIgnoreCase(code)) {
            
                return item;
            }
        }
        return null;
    }
}
