package JavaOOP.oop9week.ex3;

public class Sun implements Planet {

    private static Sun INSTANCE;

    private Sun() {

    }

    public static Sun getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Sun();
        }
        return INSTANCE;
    }
}

