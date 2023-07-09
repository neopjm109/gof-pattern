package dev.jmpark.gof.creational.abstract_factory;

import dev.jmpark.gof.creational.factory.Car;

/**
 * abstract class 를 사용하거나
 * interface 를 사용하면 된다.
 */
public abstract class AbstractCarFactory {
    public abstract Car createCar(String type);
}

/*
public interface AbstractCarFactory {
    public abstract Car createCar(String type);
}
*/