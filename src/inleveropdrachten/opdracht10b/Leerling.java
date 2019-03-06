package inleveropdrachten.opdracht10b;
import java.io.Serializable;
public class Leerling implements Serializable{
    private String naam;
    private double cijfer;

    public Leerling(String nm){
        naam = nm;
    }

    public String getNaam(){
        return naam;
    }

    public void setCijfer(double cfr) {
        cijfer = cfr;
    }

    public double getCijfer(){
        return cijfer;
    }

    public String toString(){
        return String.format("%s heeft cijfer: %.1f", naam, cijfer);
    }
}
