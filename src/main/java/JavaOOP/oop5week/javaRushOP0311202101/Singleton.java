package JavaOOP.oop5week.javaRushOP0311202101;


/*
Самая простая реализация.
Плюсы:
Простота и прозрачность кода
Потокобезопасность
Высокая производительность в многопоточной среде
Минусы:
Не ленивая инициализация.
В попытке исправить последний недостаток, мы получаем реализацию номер два:
 */


public class Singleton {


    private static final Singleton instance = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }
}
