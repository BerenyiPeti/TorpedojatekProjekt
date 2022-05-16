package torpedoprojekt;

public class Torpedo {
    private int tablaHossz;
    private boolean talalt;
    private int tipp;
    private String[] palya = new String[tablaHossz];

    public Torpedo(int tipp) {
        this(7, false, tipp);
    }

    public Torpedo(int tablaHossz, boolean talalt, int tipp) {
        this.tablaHossz = tablaHossz;
        this.talalt = talalt;
        this.tipp = tipp;
    }
    
    
    
    
}
