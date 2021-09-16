package com.yanhuan.modernjavainaction.cap11;

import java.util.Optional;

/**
 * @author : yan
 * -----------------------------------------------------
 */
public class Person {
    private Optional<Car> car;

    public Optional<Car> getCar() {
        return car;
    }

    public int getAge() {
        return 1;
    }
}
