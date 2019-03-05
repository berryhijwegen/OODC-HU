package inleveropdrachten.opdracht7;

public class Utils {
    private static int count;

    public static String euroBedrag(double bedrag) {
        count++;
        return String.format("€%.2f", bedrag);
    }
    public static String euroBedrag(double bedrag, int precisie) {
        count++;
        return String.format("€%." + precisie + "f", bedrag);
    }

    public static int getCount(){
        return count;
    }
}
