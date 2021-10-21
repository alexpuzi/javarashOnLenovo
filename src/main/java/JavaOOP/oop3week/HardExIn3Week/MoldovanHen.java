package JavaOOP.oop3week.HardExIn3Week;

public class MoldovanHen extends Hen {

    private static int countOfEggsPerMont = 23;
    @Override
    public int getCountOfEggsPerMonth() {
        return countOfEggsPerMont;
    }
    public String getDescription(){

        return super.getDescription()+ String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.MOLDOVA,getCountOfEggsPerMonth());
    }
}
