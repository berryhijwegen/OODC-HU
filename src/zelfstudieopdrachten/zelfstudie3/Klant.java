package zelfstudieopdrachten.zelfstudie3;

public class Klant {
    private String naam;
    private String adres;

    public Klant(String nm, String adr){
        naam = nm;
        adres = adr;
    }

    public String getNaam(){
        return naam;
    }
    public String getAdres(){
        return adres;
    }
}
