package com.yanhuan.modernjavainaction.cap05;

/**
 * @author : yan
 * @Project Name : test
 * @Package Name : com.yanhuan.javashizhan.cap05
 * @Creation Date: 2020-03-23 23:55
 * -----------------------------------------------------
 */
public class Trader {
    private final String name;

    private final String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
