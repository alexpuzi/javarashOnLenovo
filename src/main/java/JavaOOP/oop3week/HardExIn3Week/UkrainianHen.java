package JavaOOP.oop3week.HardExIn3Week;

public class UkrainianHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth() {
        return 33;
    }
    public String getDescription(){

        return super.getDescription()+ String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.UKRAINE,getCountOfEggsPerMonth());
    }
}
