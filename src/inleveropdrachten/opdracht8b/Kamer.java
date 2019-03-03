package inleveropdrachten.opdracht8b;

public class Kamer {
    private int nummer;
    private KamerType kamertype;

    public Kamer(int nmmr, KamerType kmrtp){
        nummer = nmmr;
        kamertype = kmrtp;
    }

    public int getNummer() {
        return nummer;
    }

    public KamerType getKamertype() {
        return kamertype;
    }
}
