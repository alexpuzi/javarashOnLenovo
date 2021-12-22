package JavaOOP.oop7week;
/*
В статическом блоке инициализируй labels пятью различными парами ключ-значение.

Требования:
•	В классе Solution должен быть только один метод — main().
•	В классе Solution должно быть объявлено статическое поле labels типа Map.
•	Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
•	Метод main должен выводить содержимое labels на экран.
 */


import java.util.HashMap;
import java.util.Map;

public class JavaRushOOP1711202100 {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(5.5, "five and a half");
        labels.put(7.1, "seven point 1");
        labels.put(7.2, "seven point 2");
        labels.put(7.3, "seven point 3");
        labels.put(7.4, "seven point 4");
    }

    public static void main(String[] args) {
        labels.put(12.2,"ASD");
        labels.put(11.2,"QWE");
        labels.put(13.2,"PPO");
        labels.put(14.5,"LDW");
        labels.put(17.9,"POC");



        System.out.println(labels);
    }
}
