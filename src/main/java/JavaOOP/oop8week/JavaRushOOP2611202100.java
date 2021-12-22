package JavaOOP.oop8week;

/*
Считывать с консоли данные, пока не будет введено слово "exit".
Для каждого значения, кроме "exit", вызвать метод print(). Если значение:
содержит точку '.', вызвать метод print() для Double;
больше нуля, но меньше 128, вызвать метод print() для short;
меньше либо равно нулю или больше либо равно 128, вызвать метод print() для Integer;
иначе — вызвать метод print() для String.
Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна прекращать считывать данные с
клавиатуры после того, как введена строка "exit".
•	Если введенная строка содержит точку("."), и ее можно корректно
преобразовать в число типа Double - должен быть вызван метод print(Double value).
•	Если введенная строка может быть корректно преобразована в число
типа short и полученное число больше 0, но меньше 128 - должен быть вызван метод print(short value).
•	Если введенная строка может быть корректно преобразована в число
типа Integer и полученное число меньше или равно 0 или больше или
равно 128 - должен быть вызван метод print(Integer value).
•	Во всех остальных случаях должен быть вызван метод print(String value).
 */

import JavaOOP.oop8week.javaRooP_2.LatteMaker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JavaRushOOP2611202100 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        while(str.equals("exit")!=true){
            char[] arr = new char[0];

        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
