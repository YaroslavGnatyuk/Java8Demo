package ua.in.gnatyuk.java8Lambdas.config;

import ua.in.gnatyuk.java8Lambdas.music.Album;
import ua.in.gnatyuk.java8Lambdas.music.Artist;
import ua.in.gnatyuk.java8Lambdas.music.Band;
import ua.in.gnatyuk.java8Lambdas.music.Composition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConfigApp {
    private List<Artist> artists;
    private Band trio;
    private List<Album> albums;
    private List<Composition> compositions;

    public ConfigApp() {
        artists = Arrays.asList(new Artist("Vovan", "Ukraine"),
                             new Artist("Evgen", "Russia"),
                             new Artist("Yan", "Moldova"),
                             new Artist("Elen", "England"),
                             new Artist("John", "USA"),
                             new Artist("Phillimon", "USA"),
                             new Artist("Keith", "England"));

        trio = new Band();
        trio.getArtists().add(artists.get(0));
        trio.getArtists().add(artists.get(2));
        trio.getArtists().add(artists.get(3));

        compositions = Arrays.asList(new Composition("1"),
                new Composition("2"),
                new Composition("3"),
                new Composition("4"),
                new Composition("5"),
                new Composition("6"),
                new Composition("7"),
                new Composition("8"),
                new Composition("9"));

        albums = new ArrayList<>();
        for (int i = 0 ; i < 3; i++ ){
            albums.add(new Album());
            albums.get(i).getMusicians().add(trio);
        }

        albums.get(0).setTracks(compositions.subList(0,4));
        albums.get(1).setTracks(compositions.subList(7,9));
        albums.get(2).setTracks(compositions.subList(6,7));
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Band getTrio() {
        return trio;
    }

    public void setTrio(Band trio) {
        this.trio = trio;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Composition> getCompositions() {
        return compositions;
    }

    public void setCompositions(List<Composition> compositions) {
        this.compositions = compositions;
    }
}
