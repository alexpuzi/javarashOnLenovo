package JavaOOP.oop7week;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
В этой задаче тебе нужно:
В статическом блоке считать с консоли А и В — две переменные с типом int.
Обработать IOException в блоке catch.
Закрыть поток ввода методом close().
Требования:
•	Поле A должно быть публичным и статическим.
•	Поле B должно быть публичным и статическим.
•	Программа должна считывать данные с клавиатуры в статическом блоке.
•	Программа должна инициализировать поля A и B в статическом
блоке согласно введенным с клавиатуры значениям.
•	Программа должна выводить в консоль минимальное из
введенных с клавиатуры значений.
 */
public class JavaRushOOP1711202101 {
    public static int A;
    public static int B;



    static {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            A = Integer.parseInt(bf.readLine());
            B = Integer.parseInt(bf.readLine());
            bf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static final int MIN = min(A, B);
    public static void main(String[] args) throws IOException {

        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

}
