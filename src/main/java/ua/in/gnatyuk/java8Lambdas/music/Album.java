package ua.in.gnatyuk.java8Lambdas.music;

import java.util.ArrayList;
import java.util.List;

public class Album {
    String name;
    List<Composition> tracks;
    List<Band> musicians;

    public Album() {
        name = "Some album";

        tracks = new ArrayList<>();
        musicians = new ArrayList<>();
    }

    public Album(String name, List<Composition> tracks, List<Band> musicians) {
        this.name = name;
        this.tracks = tracks;
        this.musicians = musicians;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Composition> getTracks() {
        return tracks;
    }

    public void setTracks(List<Composition> tracks) {
        this.tracks = tracks;
    }

    public List<Band> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<Band> musicians) {
        this.musicians = musicians;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", tracks=" + tracks +
                ", musicians=" + musicians +
                '}';
    }
}
