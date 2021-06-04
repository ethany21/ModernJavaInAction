package com.github.ethany21.ModernJavaInAction.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ModernJavaInActionLambda {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Street", 12343);
        map.put("Avenue", 34263);
        map.put("area", 94346);
        map.put("Boulevard", 99342);
        map.put("City", 43348);

        Map<String,Integer> result = map.entrySet()
                .stream()
                .filter(x -> x.getValue() % 2 == 0)
                .collect(Collectors.toMap(x-> x.getKey(), x-> x.getValue()));


        result.entrySet()
                .stream()
                .forEach(System.out::println);



    }

}
