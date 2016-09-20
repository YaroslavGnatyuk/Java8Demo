package ua.in.gnatyuk.demoClasses;

import java.util.List;
import java.util.Map;

public class Sorting {
    public static void sortMapByKey(Map<String, Integer> unsorted, Map<String, Integer> result){
        unsorted.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey())
                .forEachOrdered(x->result.put(x.getKey(),x.getValue()));
    }

    public static void sortMapByValue(Map<String, Integer> unsorted, Map<String, Integer> result){
        unsorted.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .forEachOrdered(x->result.put(x.getKey(),x.getValue()));
    }

    public static void sortList(List<String> unsorted, List<String> result){
        unsorted.stream().sorted().forEach(result::add);
    }
}
