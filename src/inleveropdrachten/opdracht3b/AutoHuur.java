package inleveropdrachten.opdracht3b;

public class AutoHuur {
    private Klant huurder;
    private Auto gehuurdeAuto;
    private int aantalDagen;

    public AutoHuur(Klant hrdr, Auto ghrdauto, int antldgn){
        huurder = hrdr;
        gehuurdeAuto = ghrdauto;
        aantalDagen = antldgn;
    }

    public AutoHuur(){

    }

    public void setHuurder(Klant hrdr){
        huurder = hrdr;
    }

    public void setGehuurdeAuto(Auto ghrdauto){
        gehuurdeAuto = ghrdauto;
    }
    public Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }

    public void setAantalDagen(int antldgn){
        aantalDagen = antldgn;
    }

    public double totaleKosten(Auto ghrdauto, Klant hrdr){
        return (aantalDagen * ghrdauto.GetPrijs()) * ((100-hrdr.getKorting()) * 0.01);
    }

    public String toString(){
        if (huurder == null){
            return "  er is geen auto bekend\n  er is geen huurder bekend\n  aantal dagen: 0 en dat kost 0.0";
        }
        else {
            return String.format("  autotype: %s\n  op naam van: %s\n  aantal dagen: %d en dat kost €%.2f", gehuurdeAuto, huurder, aantalDagen, totaleKosten(gehuurdeAuto, huurder));
        }
    }
}
