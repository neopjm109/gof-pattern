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
    }
}