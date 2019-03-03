package inleveropdrachten.opdracht8b;

public class KamerType {
    private String naam;
    private int aantalBedden;
    private double prijs;
    private boolean extraBed;

    public KamerType(String nm, int aantalbddn, double prs, boolean extrabd){
        naam = nm;
        aantalBedden = aantalbddn;
        prijs = prs;
        extraBed = extrabd;
    }

    public String getNaam() {
        return naam;
    }

    public  boolean equals(Object obj){
        if (obj instanceof KamerType){
            KamerType kamerTypeObject = (KamerType) obj;
            if (kamerTypeObject.extraBed == this.extraBed && kamerTypeObject.aantalBedden == this.aantalBedden && kamerTypeObject.prijs == this.prijs && kamerTypeObject.naam.equals(this.naam))
                return true;
        }
        return false;
    };

    public String toString(){
        return String.format("%s, bedden: %d, €%.2f p.n. ", naam, aantalBedden, prijs);
    }
}
