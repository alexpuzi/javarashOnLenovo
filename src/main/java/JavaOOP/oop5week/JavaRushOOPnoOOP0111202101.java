package JavaOOP.oop5week;



/*
Давай найдем наибольший общий делитель (НОД). Для этого:
Введи с клавиатуры 2 целых положительных числа.
Выведи в консоли наибольший общий делитель.
Требования:
•	Программа должна считывать с клавиатуры 2 строки.
•	Программа должна выводить данные на экран.
•	Программа должна выводить на экран наибольший общий делитель (НОД) чисел, считанных с клавиатуры, и успешно завершаться.
 */

/*
ФОРМУЛА: В остальных случаях,
чтобы найти наибольший общий делитель
двух чисел используется следующий порядок действий:

1) Из двух данных чисел большее число делят на меньшее.
2) Затем, меньшее число делят на остаток, получившийся
от деления большего числа на меньшее.
3) Далее, первый остаток делят на второй остаток, который
получился от деления меньшего числа на первый остаток.
4) Второй остаток делят на третий, который получился от
деления первого остатка на второй и т. д.
5) Таким образом деление продолжается до тех пор, пока в
остатке не получится нуль. Последний делитель как раз
и будет наибольшим общим делителем.
 */

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JavaRushOOPnoOOP0111202101  {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str_1 = bf.readLine();
        int number_1 = Integer.parseInt(str_1);
        String str_2 = bf.readLine();
        int number_2 = Integer.parseInt(str_2);
        System.out.format("number 1 - %s, number 2 - %s%n",number_1,number_2);

        int nod = getNOD_2(number_1,number_2);
        int nod2 = getNODJavaRush(number_1,number_2);
        System.out.println("NOD moy: "+nod);
        System.out.println("NOD javaRash: "+nod2);
    }
    public static int getNOD(int n_1, int n_2){
      /*
      Алгоритм
1.    НОД(0, n) = n; НОД(m, 0) = m; НОД(m, m) = m; +
2.    НОД(1, n) = 1; НОД(m, 1) = 1; +
3.    Если m, n чётные, то НОД(m, n) = 2*НОД(m/2, n/2);
4.    Если m чётное, n нечётное, то НОД(m, n) = НОД(m/2, n);
5.    Если n чётное, m нечётное, то НОД(m, n) = НОД(m, n/2);
6.    Если m, n нечётные и n > m, то НОД(m, n) = НОД((n-m)/2, m);
7.    Если m, n нечётные и n < m, то НОД(m, n) = НОД((m-n)/2, n);
       */
        if(n_1 == 0 && n_2 != 0){
            return n_2;
        }else if(n_1 !=0 && n_2 ==0){
            return n_1;
        }else if(n_1 ==1 && n_2 !=0){
            return n_1;
        }else if(n_2 ==1 && n_1 !=0){
            return n_2;
        }else if(n_1%2==0 && n_2%2==0){
            int temp = (n_1/2 + n_2/2)*2;
            return temp;
        }else if(n_1 == n_2){
            return n_1;
        }else if(n_1 !=0 && n_2 ==0){
            return n_1;
        }else if(n_1 !=0 && n_2 ==0){
            return n_1;
        }

       return 0;
    }
    public static int getNOD_2(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    private static int getNODJavaRush(int first, int second) {
        if (first < 1 || second < 1) {
            throw new IllegalArgumentException();
        }

        while (first != second) {
            if (first > second) {
                first -= second;
            }
            if (second > first) {
                second -= first;
            }
        }
        return first;
    }
}
