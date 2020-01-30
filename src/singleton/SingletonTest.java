package singleton;

public class SingletonTest {
    public static void main(String... ars) {
        try {
            System.out.println();
            Singleton test = Singleton.getInstance();
            System.out.println(test.sayHi());
            Thread.sleep(10);
            Singleton test2 = Singleton.getInstance();
            System.out.println(test2.sayHi());
            System.out.println();

            NotASingleton testNoSingleton = new NotASingleton();
            System.out.println(testNoSingleton.sayHi());
            Thread.sleep(10);
            NotASingleton testNoSingleton2 = new NotASingleton();
            System.out.println(testNoSingleton2.sayHi());
        } catch (InterruptedException ex) {

        }
    }
}
