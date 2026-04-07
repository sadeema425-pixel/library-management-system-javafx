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
public class Borrow {
    private Member member;
    private Item item;

    Borrow() {
    }

    Borrow(Member member, Item item) {
        this.member = member;
        this.item = item;
    }
    
    
      void setMember(Member member) {
        this.member = member;
    }

    Member getTitle() {
        return member;
    }
    
       void setItem(Item item) {
        this.item = item;
    }

    Item getItem() {
        return item;
    }

    String getIdBook() {
        return item.getCode();

    }

    String getIdMemberId() {
        return member.getUsername();
    }

    Date getDateOfReturn() {
        return item.getDate();
    }

}
