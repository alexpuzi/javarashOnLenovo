package JavaOOP.op2week;
/*
Давай напишем программу, которая поможет тебе выбрать, что съесть на обед.
Для этого нужно:
Реализовать интерфейс Selectable в классе Food.
Метод onSelect() должен выводить на экран фразу "The food was selected".
Подумай, какие методы можно вызвать для переменной food, а какие для — selectable.
В методе callFoodMethods вызови методы onSelect, onEat, если это возможно.
В методе callSelectableMethods вызови методы onSelect, onEat, если это возможно.
Не используй явное приведение типов.
Требования:
•	Интерфейс Selectable должен быть реализован в классе Food.
•	Метод onSelect() в классе Food должен выводить на экран фразу "The food was selected".
•	В методе callFoodMethods должны вызываться методы объекта типа Food.
•	В методе callSelectableMethods должны вызываться
 методы доступные у любого объекта реализующего интерфейс Selectable.
 */
public class JavaRush131020202100 {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();

        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        food.onEat();
        food.onSelect();
    }

    public static void callSelectableMethods(Selectable selectable) {
        selectable = new Food();
        selectable.onSelect();
    }
    //
    interface Selectable {
        void onSelect();
    }
    //
    static class Food implements Selectable{
        public void onEat() {
            System.out.println("The food was eaten");
        }

        @Override
        public void onSelect() {
           System.out.println("The food was selected");
        }
    }
    //
}
