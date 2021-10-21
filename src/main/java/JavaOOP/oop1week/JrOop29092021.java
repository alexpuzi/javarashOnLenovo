package JavaOOP.oop1week;

public class JrOop29092021 {

}

class Cat implements CanClimb, CanRun{

    @Override
    public void run() {

    }
}

class Dog implements CanRun{
    @Override
    public void run() {

    }
}

class Tiger extends Cat {
}

class Duck implements CanFly, CanRun{
    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }
}

