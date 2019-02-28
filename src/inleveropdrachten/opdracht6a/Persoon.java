package inleveropdrachten.opdracht6a;

import java.util.ArrayList;
import java.util.Objects;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<Game>();

    public Persoon(String nm, double bud){
        naam = nm;
        budget = bud;
    }

    public ArrayList<Game> getGames(){
        return mijnGames;
    }

    public boolean koop(Game g){
        boolean result = false;
        if(mijnGames.contains(g)){
            return result;
        }
        if (budget >= g.huidigeWaarde()){
            budget -= g.huidigeWaarde();
            mijnGames.add(g);
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (mijnGames.contains(g)) {
            if (koper.koop(g)) {
                mijnGames.remove(g);
                budget += g.huidigeWaarde();
                return true;
            }
        }
        return false;
    }

    public String toString(){
        var s = String.format("%s heeft een budget van €%.2f en bezit de volgende games:\n",naam, budget);
        for(Game game : mijnGames){
            s+= game + "\n";
        }
        return s;
    }
}
