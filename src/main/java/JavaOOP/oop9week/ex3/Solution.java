package JavaOOP.oop9week.ex3;

/*
Для решения этой задачи тебе нужно:
Найти пример паттерна Singleton с ленивой
реализацией (lazy initialization).

По образу и подобию в отдельных файлах создать
в отдельных файлах три класса синглтона — Sun, Moon, Earth.

Реализовать интерфейс Planet в классах Sun, Moon, Earth.
В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet().
Реализовать функционал метода readKeyFromConsoleAndInitPlanet():
для этого считай с консоли один параметр типа String.
если он равен одной из констант интерфейса Planet, создай
соответствующий объект и присвой его Planet thePlanet,
иначе — обнули Planet thePlanet.

Требования:
•	Класс Sun не должен позволять создавать объекты своего типа за пределами
класса.
•	Класс Sun должен содержать приватное статическое поле instance типа Sun.
•	В классе Sun должен быть реализован публичный статический метод getInstance(), возвращающий значение поля instance.
•	Метод getInstance() в классе Sun должен всегда возвращать один и тот же объект.
•	Поле instance класса Sun должно быть инициализировано только после первого обращения к методу getInstance().
•	Класс Moon не должен позволять создавать объекты своего типа за пределами класса.
•	Класс Moon должен содержать приватное статическое поле instance типа Moon.
•	В классе Moon должен быть реализован публичный статический метод getInstance(), возвращающий значение
поля instance.
•	Метод getInstance() в классе Moon должен всегда возвращать один и тот же объект.
•	Поле instance класса Moon должно быть инициализировано только после первого обращения к методу getInstance().
•	Класс Earth не должен позволять создавать объекты своего типа за пределами класса.
•	Класс Earth должен содержать приватное статическое поле instance типа Earth.
•	В классе Earth должен быть реализован публичный статический метод
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        switch (str) {
            case Planet.EARTH:
                thePlanet = Earth.getInstance();
                break;
            case Planet.MOON:
                thePlanet = Moon.getInstance();
                break;
            case Planet.SUN:
                thePlanet = Sun.getInstance();
                break;
            default:
                thePlanet = null;
                break;
        }

    }
}


