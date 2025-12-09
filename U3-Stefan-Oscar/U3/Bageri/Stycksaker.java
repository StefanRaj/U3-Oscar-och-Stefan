package Bageri;

public class Stycksaker extends MenuItem {
    private int antalExemplar;

    public Stycksaker(String namn, int pris, int antalExemplar) {
        super(namn, 0);
        this.antalExemplar = antalExemplar;
    }
    public void beskrivning(){
        System.out.println(namn + " | " + pris + " kr");
    }
}
