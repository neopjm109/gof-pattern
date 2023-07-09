package dev.jmpark.gof.creational.factory;

public class CarFactory {
    public Car createCar(String type) {
        return switch (type.toLowerCase()) {
            case "kia" -> new KiaCar();
            case "hyundai" -> new HyundaiCar();
            case "bmw" -> new BmwCar();
            default -> null;
        };
    }
}
