package inleveropdrachten.opdracht6b;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = nwpr;
    }

    public String getNaam(){
        return naam;
    }

    public double huidigeWaarde(){
        return nieuwprijs * Math.pow(0.7, LocalDate.now().getYear() - releaseJaar);
    }

    public boolean equals(Object anderObject){
        if(anderObject instanceof Game){
            Game gameObject = (Game) anderObject;
            if (gameObject.naam.equals(this.naam) && gameObject.releaseJaar == this.releaseJaar && gameObject.nieuwprijs == this.nieuwprijs){
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString(){
        return String.format("      %s, uitgegeven in %d; nieuwprijs: %.2f nu voor: %.2f", naam, releaseJaar, nieuwprijs, huidigeWaarde());
    }
}
