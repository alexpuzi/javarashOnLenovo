package JavaOOP.oop4week;

import java.util.LinkedList;
import java.util.List;

/*
Исправь четыре ошибки
У нас есть программа, которая должна заполнять список
и выводить его определенным образом в консоли.
Сейчас она работает некорректно. Чтобы исправить программу:
Подумай что делает метод main().
Создай в классе Solution статические методы
initList(List<Number> list), printListValues(List<Number> list),
processCastedObjects(List<Number> list).
Найди блок кода, который заполняет значениями список,
и перемести его в метод initList.
Найди блок кода, который в цикле for выводит на экран содержимое списка,
и перемести его в метод printListValues.
Найди блок кода, в котором для каждого объекта списка проверяется тип и
выводятся сообщения на экран, и перемести его в метод processCastedObjects.
Исправь 2 ошибки в методе printListValues так, чтобы на экран корректно
 выводилось содержимое переданного в качестве параметра списка.
У нас есть программа, которая должна заполнять список и выводить его
определенным образом в консоли.
Сейчас она работает некорректно. Чтобы исправить программу:
Подумай что делает метод main().
Создай в классе Solution статические методы initList(List<Number> list),
printListValues(List<Number> list), processCastedObjects(List<Number> list).
Найди блок кода, который заполняет значениями список, и перемести его в
метод initList.
Найди блок кода, который в цикле for выводит на экран содержимое списка,
и перемести его в метод printListValues.
Найди блок кода, в котором для каждого объекта списка проверяется тип и
выводятся сообщения на экран, и перемести его в метод processCastedObjects.
Исправь 2 ошибки в методе printListValues так, чтобы на экран корректно
выводилось содержимое переданного в качестве параметра списка.
•	Метод processCastedObjects должен анализировать элементы списка и
для объектов типа Float или Double выводить на экран текст согласно условию задачи.
*/
public class JavaRushOOP2810202100 {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();
        initList(list);
        printListValues(list);
        processCastedObjects(list);
    }

    public static void initList(List<Number> list) {
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));

    }

    public static void printListValues(List<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void processCastedObjects(List<Number> list) {
        for (Number object : list) {
            //Исправь 2 ошибки
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }
    }
}
