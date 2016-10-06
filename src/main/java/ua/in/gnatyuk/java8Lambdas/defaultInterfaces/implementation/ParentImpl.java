package ua.in.gnatyuk.java8Lambdas.defaultInterfaces.implementation;

import ua.in.gnatyuk.java8Lambdas.defaultInterfaces.interfaces.Parent;
import ua.in.gnatyuk.java8Lambdas.defaultInterfaces.interfaces.ParentII;

public class ParentImpl implements Parent, ParentII {
    @Override
    public void moveForvard() {
        System.out.println("Double penetration");
    }
}
