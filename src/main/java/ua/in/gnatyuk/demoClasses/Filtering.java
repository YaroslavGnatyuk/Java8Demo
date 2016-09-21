package ua.in.gnatyuk.demoClasses;

import java.awt.*;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Filtering {
    public static void filterNullFromListI(List<String> withNull, List<String> withoutNull){
        withNull.stream()
                .filter(x->x!=null)
                .forEach(x->withoutNull.add(x));
    }

    public static void filterNullFromListII(List<String> withNull, List<String> withoutNull){
        withNull.stream()
                .filter(Objects::nonNull)
                .forEach(x->withoutNull.add(x));
    }

    public static List<String> filterSomeStringFromList(List<String> listForFiltering, String word){
        List<String> result = listForFiltering.stream()
                .filter(x->!x.equals(word)).collect(Collectors.toList());

        return result;
    }
}
