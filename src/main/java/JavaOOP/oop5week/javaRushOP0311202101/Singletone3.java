package JavaOOP.oop5week.javaRushOP0311202101;

/*
Double Checked Locking

Плюсы:
Ленивая инициализация.

Потокобезопасность

Высокая производительность в многопоточной среде

Минусы:
Не поддерживается на версиях Java ниже 1.5
(в версии 1.5 исправили работу ключевого слова volatile)

Отмечу, что для корректной работы данного
варианта реализации обязательно одно из двух условий.
Переменная INSTANCE должна быть либо final, либо volatile.
 */

public class Singletone3 {
    private static Singletone3 INSTANCE;

    private Singletone3(){}

    public static Singletone3 getINSTANCE() {
        if(INSTANCE == null){
            synchronized (Singletone3.class){
                if (INSTANCE == null){
                    INSTANCE = new Singletone3();
                }
            }
        }
        return INSTANCE;
    }
}
