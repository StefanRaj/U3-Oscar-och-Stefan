package Bageri;

public abstract class MenuItem {

    protected String namn;

    protected int pris;

    public MenuItem(String namn, int pris) {
        this.namn = namn;
        this.pris = pris;
    }
    public abstract void beskrivning();

    public abstract int getPris();

}
