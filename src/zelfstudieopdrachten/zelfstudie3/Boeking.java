package zelfstudieopdrachten.zelfstudie3;

import java.time.LocalDate;
import java.util.Date;

public class Boeking {
    private Date boekingsDatum;
    private LocalDate aankomstDatum;
    private LocalDate vertrekDatum;
    private Klant boeker;
    private Kamer geboekteKamer;

    public Boeking(LocalDate van, LocalDate tot, Klant bkr, Kamer gebkteKamer) {
        boekingsDatum = new Date();
        aankomstDatum = van;
        vertrekDatum = tot;
        boeker = bkr;
        geboekteKamer = gebkteKamer;
    }

    public LocalDate getAankomstDatum(){
        return aankomstDatum;
    }

    public LocalDate getVertrekDatum(){
        return vertrekDatum;
    }

    public Kamer getGeboekteKamer() {
        return geboekteKamer;
    }

    public String toString(){
        return String.format("  Kamer %d is geboekt door %s van %s tot %s.", geboekteKamer.getNummer(), boeker.getNaam(), aankomstDatum, vertrekDatum);
    }
}
