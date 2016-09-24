package ua.in.gnatyuk.util;

public class Artist {
    String name;
    String origin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Artist(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    public boolean isFrom(String country){
        if(this.origin.compareTo(country) == 0){
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
