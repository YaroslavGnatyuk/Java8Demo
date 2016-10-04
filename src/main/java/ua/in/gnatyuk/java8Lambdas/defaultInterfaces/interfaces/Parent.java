package ua.in.gnatyuk.java8Lambdas.defaultInterfaces.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: asutp
 * Date: 04.10.16
 * Time: 6:10
 * To change this template use File | Settings | File Templates.
 */
public interface Parent {
    public default void moveForvard(){
        System.out.println("I will go forward!!!");
    }
}
