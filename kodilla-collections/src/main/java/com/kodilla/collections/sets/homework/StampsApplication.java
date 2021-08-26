package com.kodilla.collections.sets.homework;


import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("First","12X20", true ));
        stamps.add(new Stamp("Second","10X21", true ));
        stamps.add(new Stamp("Third","12X21", false ));
        stamps.add(new Stamp("Fourth","14X21", false ));
        stamps.add(new Stamp("Fifth","15X21", true ));
        stamps.add(new Stamp("Sixth","17X21", false ));
        stamps.add(new Stamp("Second","10X21", true ));
        stamps.add(new Stamp("Second","10X21", true ));
        stamps.add(new Stamp("Second","10X21", true ));
        stamps.add(new Stamp("Second","10X21", true ));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
