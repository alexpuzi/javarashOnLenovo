package JavaOOP.oop10week.multiTr;

import JavaOOP.oop1week.JRAbstr0410202100;

import java.util.ArrayList;
import java.util.List;

/*
В методе main добавить в статический объект list 5 нитей. Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.

Требования:
•	В методе main создай 5 объектов типа SpecialThread.
•	В методе main создай 5 объектов типа Thread.
•	Добавь 5 разных нитей в список list.
•	Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
•	Класс SpecialThread изменять нельзя.
 */


public class Solution1012202103 {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread sp1 = new SpecialThread();
        SpecialThread sp2 = new SpecialThread();
        SpecialThread sp3 = new SpecialThread();
        SpecialThread sp4 = new SpecialThread();
        SpecialThread sp5 = new SpecialThread();

        Thread tr1 = new Thread(sp1);
        Thread tr2 = new Thread(sp2);
        Thread tr3 = new Thread(sp3);
        Thread tr4 = new Thread(sp4);
        Thread tr5 = new Thread(sp5);

        tr1.start();
        tr2.start();
        tr3.start();
        tr4.start();
        tr5.start();

//        list.add(tr1);
//        list.add(tr2);
//        list.add(tr3);
//        list.add(tr4);
//        list.add(tr5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
