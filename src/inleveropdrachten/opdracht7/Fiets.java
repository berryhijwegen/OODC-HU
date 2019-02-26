package inleveropdrachten.opdracht7;

import java.time.LocalDate;

public class Fiets extends Voertuig{
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr){
        super(tp, pr, jr);
        framenummer = fnr;
    }

    public double huidigeWaarde() {
        return nieuwprijs * Math.pow(0.9, LocalDate.now().getYear() - bouwjaar);
    }

    public boolean equals(Object obj){
        boolean result = false;
        if (obj instanceof Fiets){
            Fiets fietsObject = (Fiets) obj;
            if (fietsObject.type.equals(this.type) && fietsObject.nieuwprijs == this.nieuwprijs && fietsObject.bouwjaar == this.bouwjaar && fietsObject.framenummer == this.framenummer){
                result = true;
            }
        }
        return result;
    }
}
