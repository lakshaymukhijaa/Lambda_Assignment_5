package com.distinctString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctStringApplicationClass {

    public static List<String> getDistinctStrings(List<String> stringList){

        // Lambda expression to implementing required tasks.
        Function<List<String>, List<String>> distinctStrings = string -> string.stream()
                .distinct()     // It is used to get distinct elements
                .sorted()       // It is used to sort the list
                .collect(Collectors.toList()); // collecting as a list
        return distinctStrings.apply(stringList);
    }
    // main method
    public static void main(String[] arguments) {

        List<String> list= new ArrayList<>();
        System.out.println("Type words in a single line");
        Scanner string_input =new Scanner(System.in);
        String line1 = string_input.nextLine();

        String[] stringList3= line1.split("\\s");
        Collections.addAll(list, stringList3);
        // output
        System.out.println("Distinct Values are : " +DistinctStringApplicationClass.getDistinctStrings(list));
    }
}
