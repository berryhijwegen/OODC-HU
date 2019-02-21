package inleveropdrachten.opdracht2a;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad() {
    }

    public Zwembad(double brdt, double lngt, double dpt) {
        breedte = brdt;
        lengte = lngt;
        diepte = dpt;
    }

    public double getBreedte(){
        return breedte;
    }
    public void setBreedte(double newBreedte){
        breedte = newBreedte;
    }

    public double getLengte(){
        return lengte;
    }
    public void setLengte(double newLengte){
        lengte = newLengte;
    }

    public double getDiepte(){
        return diepte;
    }
    public void setDiepte(double newDiepte){
        diepte = newDiepte;
    }


    public double inhoud(){
        return breedte * lengte * diepte;
    }

    public String toString(){
        return String.format("Dit zwembad is %.2f meter breed, %.2f meter lang, %.2f meter diep, en heeft een inhoud van %.2f meter.", breedte, lengte, diepte, inhoud());
    }
}
