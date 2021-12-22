package JavaOOP.oop5week.javaRushOP0311202101;
/*

Плюсы:
Ленивая инициализация.
Потокобезопасность.
Высокая производительность в многопоточной среде.
Минусы:
Для корректной работы необходима гарантия,
что объект класса Singleton инициализируется без ошибок.
 Иначе первый вызов метода getInstance
 закончится ошибкой ExceptionInInitializerError,
 а все последующие NoClassDefFoundError.

 Реализация практически идеальная. И ленивая,
 и потокобезопасная, и быстрая. Но есть нюанс,
 описанный в минусе.
 */
public class ClassHolderSingleton {
    private static final ClassHolderSingleton HOLDER_INSTANCE = new ClassHolderSingleton();

    private ClassHolderSingleton(){}
    private static class SingletonHolder {
        public static final ClassHolderSingleton HOLDER_INSTANCE = new ClassHolderSingleton();
    }
    public static ClassHolderSingleton getInstance(){
        return ClassHolderSingleton.HOLDER_INSTANCE;
    }
}
