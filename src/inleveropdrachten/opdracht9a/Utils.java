package inleveropdrachten.opdracht9a;

public class Utils {
    private static int count;

    public static String euroBedrag(double bedrag) {
        count++;
        return euroBedrag(bedrag, 2);
    }
    public static String euroBedrag(double bedrag, int precisie) {
        count++;
        return String.format("€%." + precisie + "f", bedrag);
    }

    public static int getCount(){
        return count;
    }
}
