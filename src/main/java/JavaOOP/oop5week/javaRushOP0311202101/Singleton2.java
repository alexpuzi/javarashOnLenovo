package JavaOOP.oop5week.javaRushOP0311202101;

/*
Плюсы:
Ленивая инициализация.

Минусы:
Не потокобезопасно

Реализация интересна.
Мы можем инициализироваться лениво,
но утратили потокобезопасность.
Не беда: в реализации номер три мы все синхронизируем.

 */

public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
