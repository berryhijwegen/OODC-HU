package inleveropdrachten.opdracht7;
import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<Goed>();

    public BedrijfsInventaris(String nm, double bud){
        bedrijfsnaam = nm;
        budget = bud;
    }
    public void schafAan(Goed goed){
        if (goed.huidigeWaarde() < budget && !alleGoederen.contains(goed)){
            budget-= goed.huidigeWaarde();
            alleGoederen.add(goed);
        }
    }

    public String toString(){
        String s = "HU met inventaris:\n";
        for(Goed goed : alleGoederen){
            s+= goed + "\n";
        }
        return s;
    }
}
