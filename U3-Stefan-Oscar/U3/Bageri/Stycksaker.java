package Bageri;

public class Stycksaker extends MenuItem {


    public Stycksaker(String namn, int pris) {
        super(namn, 0);

        this.namn = namn;
        this.pris = pris;
    }
    public int getPris() {
        return this.pris;

    }
    public String toString(){
       return (namn + " | " + pris + " kr");
    }
}
