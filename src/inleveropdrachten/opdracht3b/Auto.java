package inleveropdrachten.opdracht3b;

public class Auto {
    private String naam;
    private float prijs;

    public Auto(String nm, float prs){
        naam = nm;
        prijs = prs;
    }

    public float GetPrijs(){
        return prijs;
    }

    public String toString(){
        return String.format("%s met prijs per dag: €%.2f", naam, prijs);
    }
}
