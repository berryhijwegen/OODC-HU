package inleveropdrachten.opdracht3b;

public class Klant {
    private String naam;
    private double korting;

    public Klant(String nm){
        naam = nm;
    }

    public Klant(String nm, Double krtng){
        naam = nm;
        korting = krtng;
    }

    public void setKorting(Double krtng){
        korting = krtng;
    }

    public Double getKorting(){
        return korting;
    }

    public String toString(){
        return  String.format("%s (korting: %.2f%%)", naam, korting);
    }
}
