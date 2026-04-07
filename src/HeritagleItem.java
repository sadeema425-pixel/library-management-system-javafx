/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

/**
 *
 * @author sadeem
 */
public class HeritagleItem extends Item{
        private String origin;
    private int era;

    HeritagleItem() {
    }

    HeritagleItem(String title, String code,String origin,int era) {
        super(title, code);
       this.era=era;
       this.origin=origin;
        
    }

    //
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }
    //

    public void setEra(int era) {
        this.era = era;
    }

    public int getEra() {
        return era;
    }

    @Override
    public String toString() {
        return super.toString()+ origin + " " + era + " ";
    }
    //


    
}
