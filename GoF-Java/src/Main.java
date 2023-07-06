import dev.jmpark.gof.singleton.SingletonManager;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
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
    }
}