package inleveropdrachten.opdracht4;
import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen = new ArrayList<Leerling>();

    public Klas(String klscd){
        klasCode = klscd;
    }

    public void voegLeerlingToe(Leerling l){
        leerlingen.add(l);
    }

    public Leerling findLeerling(String nm) {
        for(Leerling leerling : leerlingen) {
            if(leerling.getNaam().equals(nm)) {
                return leerling;
            }
        }
        return null;
    }

    public void wijzigCijfer(String nm, double cfr){
        if(findLeerling(nm) != null){
            findLeerling(nm).setCijfer(cfr);
        }
    }

    public int aantalLeerlingen(){
        return leerlingen.size();
    }

    public String toString(){
        String s = "In klas V1Z zitten de volgende leerlingen:\n";
        for(Leerling leerling : leerlingen){
            s+= leerling + "\n";
        }
        return s;
     }
}
