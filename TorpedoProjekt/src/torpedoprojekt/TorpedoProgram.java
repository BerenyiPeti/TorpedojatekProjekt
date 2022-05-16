package torpedoprojekt;

import java.util.Random;

public class TorpedoProgram {

    public static void main(String[] args) {
        Torpedo t = new Torpedo();
        //System.out.println(t.toString());
        /*for (int i = 0; i < 100; i++) {
            t.elhelyez();

        }*/
        t.general();
        t.elhelyez();  
        
        /*Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            int szam = rnd.nextInt(4);
            System.out.println(szam);
        }*/
        
        
    }

}
