package JavaOOP.oop1week;
/*
В этой задаче тебе нужно:
Создать интерфейс CanMove с методом speed.
Сделать так, чтобы speed возвращал значение типа Double и ничего не принимал в качестве аргументов.
Создать и унаследовать интерфейс CanFly от интерфейса CanMove.
Добавить в интерфейс CanFly метод speed.
Убедиться, что speed возвращает значение типа Double и принимает один параметр типа CanFly.
Требования:
•	В классе Solution должен быть объявлен интерфейс CanMove.
•	В классе Solution должен быть объявлен интерфейс CanFly.
•	Интерфейс CanFly должен наследоваться от интерфейса CanMove.
•	В интерфейсе CanMove должен быть объявлен метод speed без параметров и с типом возвращаемого значения Double.
 */
public class JavaRushOOP01102021001 {
    public static void main(String[] args) throws Exception {

    }
    public interface CanMove{
        Double speed();
    }
    public interface CanFly extends CanMove {
        @Override
        Double speed();
    }
}
//    public interface Drinker {
//        void askForMore(String message);
//
//        void sayThankYou();
//
//        boolean isReadyToGoHome();
//    }
//
//    public interface Alcoholic extends Drinker {
//        boolean READY_TO_GO_HOME = false;
//
//        void sleepOnTheFloor();
//    }
//
//    public static class BeerLover implements Alcoholic{
//
//
//        public void sleepOnTheFloor(){
//
//        }
//        public void askForMore(String message){
//
//        }
//
//        public void sayThankYou(){
//
//        }
//
//        public boolean isReadyToGoHome(){
//            return READY_TO_GO_HOME;
//        }
//    }
//}
