package com.github.ethany21.ModernJavaInAction.stream;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    @Override
    public String toString() {
        return name;
    }

    public enum Type {MEAT, FISH, OTHER}

}
