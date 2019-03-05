package inleveropdrachten.opdracht7;

public abstract class Voertuig implements Goed{
    protected String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr){
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;
    }

    public boolean equals(Object obj){
        if (obj instanceof Voertuig){
            Voertuig voertuigObject = (Voertuig) obj;
            if (voertuigObject.type.equals(this.type) && voertuigObject.nieuwprijs == this.nieuwprijs && voertuigObject.bouwjaar == this.bouwjaar){
                return true;

            }
            return false;
        }
        return false;
    }

    public String toString(){
        return String.format("Voertuig: %s met bouwjaar %d heeft een waarde van: %s", type, bouwjaar, Utils.euroBedrag(huidigeWaarde()));
    }
}
