/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

/**
 *
 * @author sadeem
 */
public class Device extends Item{
        private String model;
        private String brand;
        private String type;
 

    public Device() {
    }

    public Device(String title,String code, String type, String brand, String model) {
     super(title,code);
     this.brand=brand;
     this.type=type;
     this.model=model;

    }

    //
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    //
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString()+ " "+brand + "   " + model + "  "+type;

    
}
}
