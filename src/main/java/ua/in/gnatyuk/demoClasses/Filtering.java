package ua.in.gnatyuk.demoClasses;

import java.util.List;
import java.util.Objects;

/**
 * Created by yroslav on 9/19/16.
 */
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
}
