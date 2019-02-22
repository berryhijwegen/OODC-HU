package zelfstudieopdrachten.zelfstudie3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    private String naam;
    private ArrayList<Boeking> alleBoekingen = new ArrayList<Boeking>();
    private ArrayList<KamerType> alleKamerTypen = new ArrayList<KamerType>();
    private ArrayList<Kamer> alleKamers = new ArrayList<Kamer>();
    private ArrayList<Klant> alleKlanten = new ArrayList<Klant>();

    public Hotel(String nm){
        naam = nm;
        alleKamerTypen.add(new KamerType("Standaard", 2, 50, false));
        alleKamerTypen.add(new KamerType("Gezin", 4, 85, false));
        alleKamerTypen.add(new KamerType("DeLuxe", 2, 100, true));
        for(KamerType kamertype : alleKamerTypen){
            if (kamertype.getNaam().equals("Standaard")){
                alleKamers.add(new Kamer(1, kamertype));
                alleKamers.add(new Kamer(2, kamertype));
            }
            else if (kamertype.getNaam().equals("Gezin")){
                alleKamers.add(new Kamer(3, kamertype));
                alleKamers.add(new Kamer(4, kamertype));
            }
            else {
                alleKamers.add(new Kamer(5, kamertype));
                alleKamers.add(new Kamer(6, kamertype));
            }
        }
        alleKlanten.add(new Klant("Jaap de Vries", "Plein 9"));
    }

    public int voegBoekingToe(LocalDate van, LocalDate tot, String nm, String adr, KamerType kt){
        Klant juisteKlant = null;
        for(Klant klant : alleKlanten) {
            if (nm.equals(klant.getNaam()) && adr.equals(klant.getAdres())) {
                juisteKlant = klant;
            }
        }
        for(Kamer kamer : alleKamers){
            // voor als er nog geen boekingen zijn
            if (kamer.getKamertype().equals(kt) && alleBoekingen.size() == 0){
                alleBoekingen.add(new Boeking(van, tot, juisteKlant, kamer));
                return kamer.getNummer();
            }
            // als er wel boekingen
            else if (kamer.getKamertype().equals(kt) && alleBoekingen.size() != 0){
                for(Boeking boeking : alleBoekingen){
                    if (boeking.getGeboekteKamer().equals(kamer)){
                        if (!(van.isBefore(boeking.getVertrekDatum()) && boeking.getAankomstDatum().isBefore(tot))){
                            alleBoekingen.add(new Boeking(van, tot, juisteKlant, kamer));
                            return kamer.getNummer();
                        }
                    }
                }
            }
        }
        return -1;
    }

    public ArrayList<KamerType> getKamerTypen(){
        return alleKamerTypen;
    }
    public String toString(){
        String s;
        s = String.format("Hotel %s heeft de volgende boekingen:\n", naam);
        for(Boeking boeking : alleBoekingen){
            s += boeking + "\n";
        }
        return s;
    }
}
