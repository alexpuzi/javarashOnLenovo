package JavaOOP.oop7week;

/*
В этой задаче тебе нужно:
Создать 7 нестатических public полей класса:
intVar типа int
doubleVar типа double
DoubleVar типа Double
booleanVar типа boolean
ObjectVar типа Object
ExceptionVar типа Exception
StringVar типа String
Убедиться, что они инициализируются дефолтными значениями.
Вывести их значения в заданном порядке в методе main()
Требования:
•	В классе Solution должно быть объявлено поле intVar типа int.
•	В классе Solution должно быть объявлено поле doubleVar типа double.
•	В классе Solution должно быть объявлено поле DoubleVar типа Double.
•	В классе Solution должно быть объявлено поле booleanVar типа boolean.
•	В классе Solution должно быть объявлено поле ObjectVar типа Object.
•	В классе Solution должно быть объявлено поле ExceptionVar типа Exception.
•	В классе Solution должно быть объявлено поле StringVar типа String.
•	Метод main должен выводить значения
полей на экран (каждое — с новой строки или через пробел)
в заданном порядке. Инициализировать переменные не нужно.
 */

import JavaOOP.oop4week.JavaRushOOP2810202100;

public class JavaRashOOP1811202100 {
    public int intVar = 0;
    double doubleVar = 0;
    public Double DoubleVar = 0.0;
    public boolean booleanVar = true;
    public Object ObjectVar = null;
    public Exception ExceptionVar = null;
    public String StringVar = null;

    public static void main(String[] args) {
        JavaRashOOP1811202100 jr = new JavaRashOOP1811202100();
        System.out.println(jr.intVar);
        System.out.println(jr.doubleVar);
        System.out.println(jr.DoubleVar);
        System.out.println(jr.booleanVar);
        System.out.println(jr.ObjectVar);
        System.out.println(jr.ExceptionVar);
        System.out.println(jr.StringVar);

    }
}
