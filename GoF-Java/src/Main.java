import dev.jmpark.gof.creational.abstract_factory.RealCarFactory;
import dev.jmpark.gof.creational.builder.Book;
import dev.jmpark.gof.creational.factory.*;
import dev.jmpark.gof.creational.prototype.PrototypeBook;
import dev.jmpark.gof.creational.singleton.SingletonManager;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        creation();
    }

    public static void creation() {
        /**
         * Singleton
         */
        System.out.println("\n########## Singleton START ##########\n");
        SingletonManager single1 = SingletonManager.getInstance();
        SingletonManager single2 = SingletonManager.getInstance();

        single1.add(10);
        System.out.println("single1 의 결과 : " + single1.show());
        System.out.println("single2 의 결과 : " + single2.show());
        System.out.println("\n########## Singleton END ##########\n");

        /**
         * Prototype
         */
        System.out.println("\n########## Prototype START ##########\n");
        PrototypeBook protoBook1 = new PrototypeBook("James Park", "Best Develop");
        PrototypeBook protoBook2 = protoBook1.copy();
        protoBook2.setContent("Fullstack Developer");

        System.out.println("protoBook1 의 결과 : " + protoBook1);
        System.out.println("protoBook2 의 결과 : " + protoBook2);
        System.out.println("\n########## Prototype END ##########\n");

        /**
         * Builder
         */
        System.out.println("\n########## Builder START ##########\n");
        Book testBook = new Book.Builder()
                .author("James Park")
                .name("Design Pattern 23")
                .contents("this pattern is Builder Pattern")
                .build();

        Book harryPotter = new Book.Builder()
                .name("Harry potter")
                .build();

        System.out.println("testBook 의 결과 : " + testBook);
        System.out.println("harryPotter 의 결과 : " + harryPotter);
        System.out.println("\n########## Builder END ##########\n");

        /**
         * Factory
         */
        System.out.println("\n########## Factory START ##########\n");
        CarFactory carFactory = new CarFactory();
        Car kia = carFactory.createCar("kia");
        Car hyundai = carFactory.createCar("hyundai");
        Car bmw = carFactory.createCar("bmw");

        System.out.println("kia 의 결과 : " + kia.brand());
        System.out.println("hyundai 의 결과 : " + hyundai.brand());
        System.out.println("bmw 의 결과 : " + bmw.brand());
        System.out.println("\n########## Factory END ##########\n");

        /**
         * Abstract Factory
         */
        System.out.println("\n########## AbstractFactory START ##########\n");
        RealCarFactory ralCarFactory = new RealCarFactory();
        Car absKia = carFactory.createCar("kia");
        Car absHyundai = carFactory.createCar("hyundai");
        Car absBmw = carFactory.createCar("bmw");

        System.out.println("abs kia 의 결과 : " + absKia.brand());
        System.out.println("abs hyundai 의 결과 : " + absHyundai.brand());
        System.out.println("abs bmw 의 결과 : " + absBmw.brand());
        System.out.println("\n########## AbstractFactory END ##########\n");
    }
}