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
        for (Game game : mijnGames) {
            if (g.toString().equals(game.toString())){
                return false;
            }
        }
        if (budget >= g.huidigeWaarde()){
            budget -= g.huidigeWaarde();
            mijnGames.add(g);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean verkoop(Game g, Persoon koper) {
        for (Game game : mijnGames) {
            if (g.toString().equals(game.toString())) {
                return koper.koop(g);
            }
        }
        return false;
    }

    public Game zoekGameOpNaam(String nm){
        for (Game game : mijnGames){
            if (game.getNaam().equals(nm)){
                return game;
            }
        }
        return null;
    }

    public String toString(){
        var s = String.format("%s heeft een budget van €%.2f en bezit de volgende games:\n",naam, budget);
        for(Game game : mijnGames){
            s+= game + "\n";
        }
        return s;
    }
}
