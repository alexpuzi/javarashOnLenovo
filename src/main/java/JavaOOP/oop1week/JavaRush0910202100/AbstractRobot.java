package JavaOOP.oop1week.JavaRush0910202100;

import JavaOOP.oop1week.JavaRushOOP0810202100.RepkaItem;
//неправильно имлеметировал (из-за невнимаельности), + логика методов стала другой.
public abstract class AbstractRobot implements Attackable, Defensable {
    private static int hitCount;
    public BodyPart attack(){
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1){
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else {
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }
    public BodyPart defense(){
        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        }else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        }else if (hitCount == 3) {
            defendedBodyPart = BodyPart.ARM;
        }else {
            hitCount = 0;
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }
}
