package JavaOOP.oop8week.javaRooP_2;

public class LatteMaker extends DrinkMaker{

    @Override
    public void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    public void putIngredient() {
        System.out.println("Делаем молоко с пенкой");
    }

    @Override
    public void pour() {
        System.out.println("Заливаем кофе");
    }
}
