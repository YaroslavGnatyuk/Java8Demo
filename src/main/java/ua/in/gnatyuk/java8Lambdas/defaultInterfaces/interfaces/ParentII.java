package ua.in.gnatyuk.java8Lambdas.defaultInterfaces.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: asutp
 * Date: 06.10.16
 * Time: 15:18
 * To change this template use File | Settings | File Templates.
 */
public interface ParentII {
    default void moveForvard(){
            System.out.println("ParentII:I will go forward!!!");
    }
}
