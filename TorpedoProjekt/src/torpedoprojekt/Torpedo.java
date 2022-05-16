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
        int szam = rnd.nextInt(5);
        
        for (int i = 0; i < 3; i++) {
            palya[i + szam] = "X";
        }
        
        /*for (int i = 0; i < palya.length; i++) {
            System.out.print(palya[i] + " ");
        }*/
    }

}
