package ua.in.gnatyuk.java8Lambdas.defaultInterfaces;

import ua.in.gnatyuk.java8Lambdas.defaultInterfaces.implementation.ParentImpl;

import java.util.Optional;

public class AppDefaultInterfaces {
    public static void main(String [] args){
        ParentImpl parent = new ParentImpl();
        parent.moveForvard();

        Optional a = Optional.ofNullable(null);
        if(!a.isPresent()){
            System.out.println("null");
        }
    }
}
