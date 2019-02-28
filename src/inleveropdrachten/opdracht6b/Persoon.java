package inleveropdrachten.opdracht6b;

import java.util.ArrayList;

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
        if(!mijnGames.contains(g) && budget >= g.huidigeWaarde()) {
            budget -= g.huidigeWaarde();
            mijnGames.add(g);
            result = true;
        }
        return result;
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (mijnGames.contains(g) && koper.koop(g)){
            mijnGames.remove(g);
            budget += g.huidigeWaarde();
            return true;
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

    public Game zoekGameOpNaam(String g){
        for(Game game : mijnGames){
            if (game.getNaam().equals(g)){
                return game;
            }
        }
        return null;
    }
}
