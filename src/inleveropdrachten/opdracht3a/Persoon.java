package inleveropdrachten.opdracht3a;

public class Persoon{
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft){
        naam = nm;
        leeftijd = lft;
    }

    public String toString(){
        return String.format("%s; leeftijd %d jaar", naam, leeftijd);
    }
}
