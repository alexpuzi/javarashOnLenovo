package JavaOOP.op2week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Давай напишем программу, которая будет давать имена
всем котикам, выпускаемым на нашей котофабрике.
Для этого нужно:
Считывать строки (параметры) с консоли, пока
пользователь не введет пустую строку (Enter).
Для каждого параметра (имени кота):
создать объект cat класса Cat, который равен коту
из getCatByKey(String параметр).
вывести на экран cat.toString().
Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна прекращать считывать данные
после ввода пустой строки.
•	Программа должна выводить на экран описание
каждого кота (cat.toString).
•	Программа должна создавать объект класса Cat
для каждого введенного имени кота (строки,
считанной с клавиатуры) c помощью метода getCatByKey.
 */
public class JavaRushOop1110202100 {



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String str = bufferedReader.readLine();
//        ArrayList<String> arrayList = new ArrayList<>();
//        while(str == ""){
//            arrayList.add(bufferedReader.readLine());
//        }
//        Cat[] arrayCat = new Cat[0];
//        ArrayList<String> arrayForTest = getTestArray(); ///// ля теста логики
//        for (int i = 0; i < arrayList.size(); i++) {
//            arrayCat[i] = CatFactory.getCatByKey(arrayList.get(i));
//            System.out.println(arrayCat);
//        }
//        try {
//            for (int i = 0; i < arrayForTest.size(); i++) {
//                arrayCat[i] = CatFactory.getCatByKey(arrayForTest.get(i));
//                System.out.println(arrayCat);
//            }
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//            System.out.println("Это произошло");
//        }
        String key;
        while (!(key = bufferedReader.readLine()).equals("")) {
            Cat cat = CatFactory.getCatByKey(key);
            System.out.println(cat.toString());
        }
    }




    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "vaska":
                    cat = new MaleCat("Василий");
                    break;
                case "murka":
                    cat = new FemaleCat("Мурочка");
                    break;
                case "kiska":
                    cat = new FemaleCat("Кисюлька");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
    public static ArrayList getTestArray(){
        ArrayList<String> arrayForTest = new ArrayList<String>();
        arrayForTest.add("vaska");
        arrayForTest.add("murka");
        arrayForTest.add("kiska");
        return arrayForTest;
    }
}
