package ua.in.gnatyuk.java8Lambdas.music;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: asutp
 * Date: 24.09.16
 * Time: 8:04
 * To change this template use File | Settings | File Templates.
 */
public class Band {
    List<Artist> artists ;

    public Band() {
        artists = new ArrayList<>();
    }

    public Band(List<Artist> artists) {
        this.artists = artists;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "Band{" +
                "artists=" + artists +
                '}';
    }
}
