package inleveropdrachten.opdracht7;

import java.time.LocalDate;

public class Auto extends Voertuig{
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt){
        super(tp, pr, jr);
        kenteken = kt;
    }

    public double huidigeWaarde() {
        return nieuwprijs * Math.pow(0.7, LocalDate.now().getYear()  - bouwjaar);
    }

    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Auto){
            Auto autoObject = (Auto) obj;
            if (autoObject.type.equals(this.type) && autoObject.nieuwprijs == this.nieuwprijs && autoObject.bouwjaar == this.bouwjaar && autoObject.kenteken.equals(this.kenteken)){
                result = true;
            }
        }
        return result;
    }
}
