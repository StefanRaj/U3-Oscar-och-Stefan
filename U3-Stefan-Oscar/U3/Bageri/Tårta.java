package Bageri;


public class Tårta extends MenuItem {
    Fyllningar[] fyllningar;
    private int antalbitar;
    private int baspris;
    private int prisPerBit = 15;

    public Tårta(String namn, int baspris, int antalbitar, Fyllningar... fyllningar) {
        super(namn,0);
        this.baspris = baspris;
        this.antalbitar = antalbitar;
        this.fyllningar = fyllningar;

        int fyllningsPris = 0;

        for (Fyllningar f : fyllningar) {
            fyllningsPris += f.getPris();
        }
        this.pris = baspris + antalbitar * prisPerBit + fyllningsPris;

    }

    public void beskrivning(){
        System.out.print(namn + " med ");
        for (int i = 0; i < fyllningar.length; i++) {
            System.out.print(fyllningar[i]);
            if (i < fyllningar.length - 1) System.out.print(", ");
        }
        System.out.println(" | Pris: " + pris + " kr");
    }
}
