package JavaOOP.oop3week.forOOP2010202100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Давай напишем программу, которая определит, чем заняться тому или иному человеку.
Для этого нужно:
Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки (ключи) могут быть такими: "user", "loser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
Для каждой введенной строки нужно:
Создать соответствующий объект [см. Person.java], например, для строки "user" нужно создать объект класса User.
Передать этот объект в метод doWork.
Написать реализацию метода doWork, который:
Вызывает метод live() у переданного объекта, если этот объект (person)
имеет тип User.
Вызывает метод doNothing(), если person имеет тип Loser.
Вызывает метод writeCode(), если person имеет тип Coder.
Вызывает метод enjoy(), если person имеет тип Proger.
Требования:
•	Метод main должен считывать строки с клавиатуры.
•	Метод main должен прекращать считывать строки с клавиатуры, как только введенная строка не совпадает с одной из ожидаемых (user, loser, coder, proger).
•	Для каждой корректной (user, loser, coder, proger) введенной строки должен быть вызван метод doWork с соответствующим объектом класса Person в качестве параметра.
•	В классе Solution должен быть реализован метод doWork с одним
параметром типа Person.
•	Метод doWork должен вызывать метод live() у переданного объекта, если этот объект имеет тип User.
•	Метод doWork должен вызывать метод doNothing() у переданного объекта, если этот объект имеет тип Loser.
•	Метод doWork должен вызывать метод writeCode() у переданного объекта, если этот объект имеет тип Coder.
•	Метод doWork должен вызывать метод enjoy() у переданного объекта, если этот объект имеет тип Proger.




Input data
user
loser
coder
proger
person
Реализовать метод printMainInfo
 */

public class JavaRushOOP2010202101 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        final String[] arrKeys = {"user", "loser", "coder", "proger"};
        Person person = null;
        String key = null;

        key = reader.readLine();
        while (!(key = reader.readLine()).equals("")) {
            key = reader.readLine();

            {

                doWork(person); //вызываем doWork
            }

        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            new Person.User();
        } else if (person instanceof Person.Loser) {
            new Person.Loser();
        } else if (person instanceof Person.Coder) {
            new Person.Coder();
        }else if (person instanceof Person.Proger) {
            new Person.Proger();
        }

    }
}

