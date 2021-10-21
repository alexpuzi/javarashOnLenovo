package JavaOOP.oop3week.HardExIn3Week;

public class BelarusianHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }
    public String getDescription(){
        return super.getDescription()+ String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.BELARUS,getCountOfEggsPerMonth());
    }
}
