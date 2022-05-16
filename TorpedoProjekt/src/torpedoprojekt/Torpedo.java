package torpedoprojekt;

import java.util.Random;

public class Torpedo {
    private int tablaHossz;
    private int hajohossz;
    private int talalatok;
    private boolean talalt;
    private int tipp;
    private String[] palya = new String[tablaHossz];
    

    public Torpedo(int tipp) {
        this(7, 3, 0, false, tipp);
    }

    public Torpedo(int tablaHossz, int hajohossz, int talalatok, boolean talalt, int tipp) {
        this.tablaHossz = tablaHossz;
        this.hajohossz = hajohossz;
        this.talalatok = talalatok;
        this.talalt = talalt;
        this.tipp = tipp;
        
    }

    public int getTablaHossz() {
        return tablaHossz;
    }

    public boolean isTalalt() {
        return talalt;
    }

    public int getTipp() {
        return tipp;
    }

    public String[] getPalya() {
        return palya;
    }

    @Override
    public String toString() {
        return "Torpedo{" + "tablaHossz=" + tablaHossz + ", talalt=" + talalt + ", tipp=" + tipp + ", palya=" + palya + '}';
    }
    
    public void general() {
        for (int i = 0; i < palya.length; i++) {
            palya[i] = "-";
        }
        
        
    }
    
    public void elhelyez() {
        Random rnd = new Random();
        int szam = rnd.nextInt(tablaHossz - (hajohossz - 1));
        for (int i = 0; i < palya.length; i++) {
            
        }
        System.out.println(szam);
    }
   
    
    
}
