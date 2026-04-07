/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

/**
 *
 * @author sadeem
 */
public abstract class Person {
    private String name;
    private int id;

    public Person() {}
    

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
  public  void setName(String name) {
        this.name = name;
    }
   public void setId(int id) {
        this.id = id;
    }
}
