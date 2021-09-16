package com.yanhuan.modernjavainaction.cap11;

import java.util.Optional;

/**
 *
 * @author : yan
 * -----------------------------------------------------
 */
public class Car {
    private Optional<Insurance> insurance;

    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}
