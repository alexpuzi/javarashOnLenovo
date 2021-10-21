package JavaOOP.oop3week.forOOP1910202100;
/*
В этой задаче тебе нужно:
Создать интерфейс Bridge с методом int getCarsCount().
Создать классы WaterBridge и SuspensionBridge,
которые реализуют интерфейс Bridge.
Метод getCarsCount() должен возвращать
любое фиксированное значение типа int.
Метод getCarsCount() должен возвращать
различные значения для различных классов.
В классе Solution создать публичный метод println(Bridge bridge).
В методе println() вывести на консоль значение getCarsCount() для объекта bridge.
Каждый класс и интерфейс должны быть в отдельных файлах.
Требования:
•	Интерфейс Bridge должен быть создан в отдельном файле.
•	Классы WaterBridge и SuspensionBridge
	Классы WaterBridge и SuspensionBridge должны
	реализовывать интерфейс Bridge.
•	Метод getCarsCount() должен возвращать различные
 значения типа int для различных классов, но всегда
 фиксированное (константное) значение для разных
 объектов одного и того же класса.
•	В классе Solution должен быть реализован
публичный(public) метод println c одним
параметром типа Bridge.
•	Метод println должен выводить в консоли
количество машин (результат работы метода
getCarsCount) для переданного ему моста
(объекта типа Bridge).
	В интерфейсе Bridge
	 должен быть определен метод int getCarsCount().
 */
public class JavaRushOOP1910202100 {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }


    public static void println(Bridge bridge){
        System.out.println(bridge.getCarsCount());
    }
}

