package inleveropdrachten.opdracht2b;

public class Voetbalclub{
    private String naam;
    private int aantalGewonnen = 0;
    private int aantalGelijk = 0;
    private int aantalVerloren = 0;

    public Voetbalclub(String nm){
        naam = nm;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int totaalGespeeld(){
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public int aantalPunten(){
        return aantalGewonnen * 3 + aantalGelijk;
    }

    public String toString(){
        return String.format( "%-10s %4d %3d %2d %2d %5d", naam, totaalGespeeld(), aantalGewonnen, aantalGelijk, aantalVerloren, aantalPunten());
    }
}
