import dev.jmpark.gof.creational.prototype.NovelBook;
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
        NovelBook protoNovel1 = new NovelBook("James Park", "Best Develop");
        protoNovel1.setImage("keyboard");
        NovelBook protoNovel2 = (NovelBook) protoNovel1.copy();
        protoNovel2.setImage("keyboard and mouse");

        System.out.println("protoNovel1 의 결과 : " + protoNovel1.toString());
        System.out.println("protoNovel2 의 결과 : " + protoNovel2.toString());
        System.out.println("\n########## Prototype END ##########\n");
    }
}