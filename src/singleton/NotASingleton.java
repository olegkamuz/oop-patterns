package singleton;

import java.util.Date;

public class NotASingleton {
    private String birthDate;

    public NotASingleton() {
        Date date = new Date();
        String preBirth = String.valueOf(date.getTime());
        this.birthDate = preBirth.substring(preBirth.length() - 3);
    }

    public String sayHi() {
        return "I`m not a singleton instance of type NotASingleton made at: " + birthDate;
    }
}
