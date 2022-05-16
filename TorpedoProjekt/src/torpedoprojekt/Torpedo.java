package torpedoprojekt;

import java.util.Random;

public class Torpedo {

    private static String[] palya = new String[7];

    public void general() {
        for (int i = 0; i < palya.length; i++) {
            palya[i] = "-";
        }

    }

    public void elhelyez() {
        Random rnd = new Random();
        int szam = rnd.nextInt(7) - 2;
        for (int i = 0; i < palya.length; i++) {

        }
    }

}
