package week1.les2;

public class Rekening {
    private int rekeningNummer;
    private double saldo;


    public Rekening(int nr){
        rekeningNummer = nr;
    }

    public double getSaldo(){
        return saldo;
    }

    public void stort(double bedrag){
        if (bedrag > 0) {
            saldo += bedrag;
        }
    }

    public void neemOp(double bedrag){
        if(bedrag > 0){
            saldo -= bedrag;
        }
    }

    public String toString(){
        return String.format("Het huidige saldo van rekeningnummer %d is €%.2f", rekeningNummer, saldo);
    }
}
