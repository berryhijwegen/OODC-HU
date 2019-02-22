package zelfstudieopdrachten.zelfstudie3;

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
}
