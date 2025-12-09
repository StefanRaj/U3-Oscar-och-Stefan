package Bageri;

public enum Fyllningar {
    Chokladmouse(15),
    Vanlijkräm(20),
    Jordgubbsylt(25),
    MangoSylt(30),
    Jordnötsmör(35);

    private final int prisFyllning;
    private Fyllningar(int prisFyllning) {
        this.prisFyllning = prisFyllning;
    }

    public int getPris() {
        return prisFyllning;
    }
}
