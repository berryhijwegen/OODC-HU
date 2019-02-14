package inleveropdrachten.opdracht3b;

public class AutoHuur {
    private Klant huurder;
    private Auto gehuurdeAuto;
    private int aantalDagen;

    public AutoHuur(Klant hrdr, Auto ghrdauto, int antldgn) {
        huurder = hrdr;
        gehuurdeAuto = ghrdauto;
        aantalDagen = antldgn;
    }

    public AutoHuur() {

    }

    public void setHuurder(Klant hrdr) {
        huurder = hrdr;
    }

    public void setGehuurdeAuto(Auto ghrdauto) {
        gehuurdeAuto = ghrdauto;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setAantalDagen(int antldgn) {
        aantalDagen = antldgn;
    }

    private double totaleKosten() {
        return (aantalDagen * gehuurdeAuto.GetPrijs()) * ((100 - huurder.getKorting()) * 0.01);
    }

    public String toString() {
        if (gehuurdeAuto == null || huurder == null) {
            String s = "";
            if (gehuurdeAuto == null) {
                s += "  er is geen auto bekend\n  ";
            } else {
                s += String.format("  autotype: %s\n  ", gehuurdeAuto);
            }
            if (huurder == null) {
                s += "er is geen huurder bekend\n  ";
            } else {
                s += String.format("op naam van: %s\n  ", huurder);
            }
            s += String.format("aantal dagen: %d en dat kost 0.0", aantalDagen);
            return s;
        } else {
            return String.format("  autotype: %s\n  op naam van: %s\n  aantal dagen: %d en dat kost €%.2f", gehuurdeAuto, huurder, aantalDagen, totaleKosten());
        }
    }
}