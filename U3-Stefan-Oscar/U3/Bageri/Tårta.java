package Bageri;


public class Tårta extends MenuItem {
    Fyllningar[] fyllningar;
    private int antalbitar;
    private final int baspris = 50;
    private final int prisPerBit = 15;

    public Tårta(String namn, Fyllningar... fyllningar) {
        super(namn, 0);
        this.antalbitar = antalbitar;
        this.fyllningar = fyllningar;

        int fyllningsPris = 0;

        for (Fyllningar f : fyllningar) {
            fyllningsPris += f.getPris();
        }
        this.pris = baspris + antalbitar * prisPerBit + fyllningsPris;

    }
    public int getPris() {
        return this.pris;
    }

    public String toString() {
        String fyllningarStr = "";

        if (fyllningar.length == 0) {
            fyllningarStr = "Inga";
        } else {
            for (int i = 0; i < fyllningar.length; i++) {
                fyllningarStr += fyllningar[i].name();
                if (i < fyllningar.length - 1) {
                    fyllningarStr += ", ";
                }
            }
        }

        return "Tårta: " + namn +
                "Antal bitar: " + antalbitar +
                "Fyllningar: " + fyllningarStr +
                "Totalpris: " + pris + " kr";
    }
}
