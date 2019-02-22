package zelfstudieopdrachten.zelfstudie3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hotel h = new Hotel("Avondrood");

        LocalDate van = LocalDate.of(2015, 6, 18);
        LocalDate tot = LocalDate.of(2015, 6, 23);

        KamerType kt = h.getKamerTypen().get(1); // eerste type in lijst
        int nr = h.voegBoekingToe(van, tot, "Jaap de Vries", "Plein 9", kt);

        if (nr != -1) {
            System.out.println("Boeking krijgt kamernummer: " + nr);
        } else {
            System.out.println("Er is helaas geen kamer beschikbaar");
        }

        System.out.println(h.toString());
    }
}