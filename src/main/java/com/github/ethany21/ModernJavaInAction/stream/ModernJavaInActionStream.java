package com.github.ethany21.ModernJavaInAction.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.Comparator.comparing;

public class ModernJavaInActionStream {

    public static void main(String[] args) {

        List<Dish> menu =  new ArrayList<>();

        List<String> lowCaloricDishesName = menu
                .stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());

        lowCaloricDishesName
                .stream()
                .forEach(System.out::println);

    }

}
