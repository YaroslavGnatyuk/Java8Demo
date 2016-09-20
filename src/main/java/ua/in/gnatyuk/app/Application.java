package ua.in.gnatyuk.app;

import java.util.*;

import static ua.in.gnatyuk.demoClasses.Filtering.*;
import static ua.in.gnatyuk.demoClasses.Sorting.*;


public class Application {
    public static void main(String[] args) {
        System.out.println("I sorted map by key here");

        Map<String, Integer> unsorted = new HashMap<>();
        Map<String, Integer> result = new LinkedHashMap<>();

        unsorted.put("z", 10);
        unsorted.put("b", 5);
        unsorted.put("a", 6);
        unsorted.put("c", 20);
        unsorted.put("d", 1);
        unsorted.put("e", 7);
        unsorted.put("y", 8);
        unsorted.put("n", 99);
        unsorted.put("j", 50);
        unsorted.put("m", 2);
        unsorted.put("f", 9);

        sortMapByKey(unsorted,result);
        System.out.println(result);

        result.clear();
/*-------------------------------------------------------------------------*/
        System.out.println("\nI sorted map by value here");
        sortMapByValue(unsorted,result);
        System.out.println(result);
/*-------------------------------------------------------------------------*/
        System.out.println("\nI sorted list here");
        List<String> unsortedList = new LinkedList<>();
        List<String> resultList = new LinkedList<>();

        unsortedList.add("First");
        unsortedList.add("Second");
        unsortedList.add("Third");
        unsortedList.add("Forth");
        unsortedList.add("Fifth");
        unsortedList.add("Sixth");
        unsortedList.add("Seventh");
        unsortedList.add("Eighth");
        unsortedList.add("Ninth");

        sortList(unsortedList,resultList);

        System.out.println(resultList);
/*-------------------------------------------------------------------------*/
        System.out.println("\nI filtered list from null-value");

        resultList.clear();
        unsortedList.clear();

        unsortedList.add("First");
        unsortedList.add(null);
        unsortedList.add("Second");
        unsortedList.add("Third");
        unsortedList.add("Forth");
        unsortedList.add(null);
        unsortedList.add("Fifth");
        unsortedList.add("Sixth");
        unsortedList.add("Seventh");
        unsortedList.add("Eighth");
        unsortedList.add(null);
        unsortedList.add("Ninth");

        filterNullFromListII(unsortedList,resultList);
        System.out.println(resultList);
/*-------------------------------------------------------------------------*/
        System.out.println("\nI filtered list from some string");

        List<String> list = Arrays.asList("meal", "food", "bed", "apple");
        List<String> listResult = filterSomeStringFromList(list, "bed");

        for(String s:listResult){
            System.out.print(s + " ");
        }
    }
}
