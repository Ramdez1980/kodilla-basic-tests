package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {

    public static void main(String[] args) {
        Book book1 = BookManager.createBook("W pustyni ...", "Sienkiewicz");
        Book book2 = BookManager.createBook("W pustyni ...", "Sienkiewicz");

        if (book1 == book2){
            System.out.println("Adresy utworzonych obiektów są takie same");
        } else {
            System.out.println("Adresy utworzonych obiektów się różnią");
        }

    }
}
