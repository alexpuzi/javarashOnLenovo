package JavaOOP.oop8week.javaRooP_2;

abstract public class DrinkMaker {
    abstract public void getRightCup(); //- выбрать подходящую чашку;
    abstract public void putIngredient(); // - положить ингредиенты;
    abstract public void pour();

    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
