import dev.jmpark.gof.creational.prototype.PrototypeDocument;
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
        PrototypeDocument proto1 = new PrototypeDocument("James Park", "Best Develop");
        PrototypeDocument proto2 = proto1.clone();

        proto1.setContent("Best Fullstack Developer");
        System.out.println("proto1 의 결과 : " + proto1.toString());
        System.out.println("proto2 의 결과 : " + proto2.toString());
        System.out.println("\n########## Prototype END ##########\n");
    }
}