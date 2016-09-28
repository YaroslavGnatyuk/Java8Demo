package ua.in.gnatyuk.java8Lambdas.music;

/**
 * Created by yroslav on 9/21/16.
 */
public class Composition {
    String name;

    public Composition() {
    }

    public Composition(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Composition{" +
                "name='" + name + '\'' +
                '}';
    }
}
