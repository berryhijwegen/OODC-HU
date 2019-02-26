package inleveropdrachten.opdracht7;

import java.time.LocalDate;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        type = tp;
        macAdres = adr;
        aanschafPrijs = pr;
        productieJaar = jr;
    }

    public double huidigeWaarde() {
        return aanschafPrijs * Math.pow(0.6, LocalDate.now().getYear() - productieJaar);
    }

    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Computer) {
            Computer computerObject = (Computer) obj;
            if (computerObject.type.equals(this.type) && computerObject.macAdres.equals(this.macAdres) && computerObject.aanschafPrijs == this.aanschafPrijs && computerObject.productieJaar == this.productieJaar) {
                result = true;
            }
        }
        return result;
    }

    public String toString(){
        return String.format("Computer: %s heeft een waarde van: €%.2f", type, huidigeWaarde());
    }
}