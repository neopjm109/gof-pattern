package dev.jmpark.gof.creational.abstract_factory;

import dev.jmpark.gof.creational.factory.BmwCar;
import dev.jmpark.gof.creational.factory.Car;
import dev.jmpark.gof.creational.factory.HyundaiCar;
import dev.jmpark.gof.creational.factory.KiaCar;

public class RealCarFactory extends AbstractCarFactory {

    @Override
    public Car createCar(String type) {
        return switch (type.toLowerCase()) {
            case "kia" -> new KiaCar();
            case "hyundai" -> new HyundaiCar();
            case "bmw" -> new BmwCar();
            default -> null;
        };
    }
}
