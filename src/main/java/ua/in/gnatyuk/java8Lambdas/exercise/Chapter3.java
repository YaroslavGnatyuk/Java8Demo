package ua.in.gnatyuk.java8Lambdas.exercise;

import ua.in.gnatyuk.java8Lambdas.config.ConfigApp;
import ua.in.gnatyuk.java8Lambdas.music.Album;
import ua.in.gnatyuk.java8Lambdas.music.Band;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Chapter3 {
    ConfigApp app = new ConfigApp();
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        sumElements(numbers);

        ConfigApp app = new ConfigApp();
        Band band = app.getTrio();
        getAllDataAboutBand(band);

        List<Album> albums = app.getAlbums();
        List<Album> temp = getAlbum(albums);

        temp.forEach(x->System.out.println(x.toString()));

        System.out.println(numberOfLowerCaseSymbols("I say hello to You:)"));

        longerWordWithLowerCaseSymbols(Arrays.asList("saDhjl","asJKasJK","efdsfdsfs"));
    }

    public static void sumElements(List numbers){
        BinaryOperator<Integer> sum = (x,y) -> x+y;
        Integer sumInt = (Integer) numbers.stream().reduce(sum).get();
        System.out.println(sumInt);
    }

    public static void getAllDataAboutBand(Band band){
        List<String> data = band.getArtists().stream()
                .map(x -> x.getName() + " " + x.getOrigin())
                .collect(Collectors.toList());
        data.forEach(x->System.out.print(x + " "));
    }

    public static List<Album> getAlbum(List<Album> albums){
        return  albums.stream()
                .filter(x-> x.getTracks().size() < 3)
                .collect(Collectors.toList());
    }

    public static Long numberOfLowerCaseSymbols(String string){
        return  string.chars()
                .filter(x-> Character.isLowerCase(x))
                .count();
    }

    public static void longerWordWithLowerCaseSymbols(List<String> list){
        Function<String,Integer> f =(s)->s.chars().filter(x->Character.isLowerCase(x)).sum();
        List<String> result = list.stream().sorted(Comparator.comparing(f)).collect(Collectors.toList());
        result.forEach(s->System.out.println(s));
    }
}
