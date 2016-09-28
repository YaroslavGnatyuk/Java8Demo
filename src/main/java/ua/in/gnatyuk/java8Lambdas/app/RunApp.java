package ua.in.gnatyuk.java8Lambdas.app;

import ua.in.gnatyuk.java8Lambdas.music.Artist;
import ua.in.gnatyuk.java8Lambdas.config.ConfigApp;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;


/**
 * Created with IntelliJ IDEA.
 * User: asutp
 * Date: 25.09.16
 * Time: 19:18
 * To change this template use File | Settings | File Templates.
 */
public class RunApp {
    public static void main(String[] args){
        ConfigApp app = new ConfigApp();
        List<Artist> artists = app.getArtists();

        System.out.println("\nConvert to upper case");
        List<String> title = artists.stream().map(string->string.toString().toUpperCase()).collect(Collectors.toList());
        title.forEach(x->System.out.println(x));

        System.out.println("\nEngland band");
        List<Artist> englandArtist = artists.stream().filter(x -> x.isFrom("England")).collect(Collectors.toList());
        englandArtist.forEach(y -> System.out.println(y));

        System.out.println("\nList sorted by name");
        Comparator<Artist> artCompare = (a, b)->a.getName().compareTo(b.getName());
        List<Artist> sortedArtist = artists.stream().sorted(artCompare).collect(Collectors.toList());
        sortedArtist.forEach(z->System.out.println(z.toString()));

        Comparator<Artist> minLengthString = (a,b) -> a.getName().length()-b.getName().length();
        Artist shortestName = artists.stream().min(minLengthString).get();
        Artist longestName = artists.stream().max(minLengthString).get();
        System.out.println("\nThe shortest name is : " + shortestName.getName() +
                            "\nThe longest name is : " + longestName.getName());

        String name = new String();
        BinaryOperator<String> str = (x,y) -> x + " " + y + " ";
        artists.stream()
                .map(artist -> artist.getName())
                .collect(Collectors.toList()).stream()
                .forEach(x->System.out.println(x));

    }
}
