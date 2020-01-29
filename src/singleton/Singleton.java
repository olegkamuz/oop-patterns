package singleton;

import java.util.Date;

public class Singleton {
    private static Singleton instance = new Singleton();
    Date date = new Date();
    String preBirth = String.valueOf(date.getTime());
    private String birthDate = preBirth.substring(preBirth.length() - 3);

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public String sayHi(){
        return "I`m singleton instance made of type Singleton at: " + birthDate;
    }
}

