package zelfstudieopdrachten.zelfstudie2;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y){
        radius = rad;
        xPositie = x;
        yPositie = y;
        if (radius <= 0){
            throw new IllegalArgumentException ("Radius moet groter dan 0 zijn!");
        }
    }

    public String toString(){
        return String.format("cirkel (%d, %d) met radius: %d", xPositie, yPositie, radius);
    }
}
