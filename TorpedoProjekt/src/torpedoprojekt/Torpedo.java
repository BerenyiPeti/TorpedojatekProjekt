package torpedoprojekt;

import java.util.Random;
import java.util.Scanner;

public class Torpedo {

    private static String[] palya = new String[7];

    public void general() {
        for (int i = 0; i < palya.length; i++) {
            palya[i] = "-";
        }
        kiir();
        
        
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
    
    public void kiir(){
        elhelyez();
        for (int i = 0; i < palya.length; i++) {
            System.out.print(palya[i] + " ");
        }
    }
    
    public void tipp(){
        Scanner src = new Scanner(System.in);
        int tipp = src.nextInt();
        if (palya[tipp-1]=="X") {
                System.out.println("talált");
            }
        else{
            System.out.println("nem talált");
        }
    }
    
    public void talalt(){
        int tipp = 4;
        int hajo = 5;
        boolean talalt = false;
        if (tipp==hajo) {
            talalt = true;
        } else {
            talalt = false;
        }
        System.out.println(talalt);
        }
        
        /*for (int i = 0; i < palya.length; i++) {
            System.out.print(palya[i] + " ");
        }*/
    }


