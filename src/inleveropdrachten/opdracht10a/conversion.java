package inleveropdrachten.opdracht10a;
import java.io.*;

public class conversion{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("src/inleveropdrachten/opdracht10a/prices_usd.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("src/inleveropdrachten/opdracht10a/prices_eur.txt");
        PrintWriter pw = new PrintWriter(fw);

        String regel = br.readLine();
        while (regel != null) {
            String[] prices = regel.split(" : ");

            String name = prices[0];
            double eurValue = usdToEur(Double.parseDouble(prices[1]), 0.918720);

            pw.println(String.format("%s : %.2f", name, eurValue));
            regel = br.readLine();
        }
        pw.close();
        br.close();
    }
    public static double usdToEur(double value, double rate){
        return value * rate;
    }
}