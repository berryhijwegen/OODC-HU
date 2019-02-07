package week1.les2;

public class Main {
    public static void main(String[] args){
        Rekening r1 = new Rekening(12345678);
        Rekening r2 = new Rekening(13578642);
        Rekening r3 = new Rekening(33444555);

        r1.neemOp(45.88);
        r2.stort(250.00);
        r2.neemOp(210.00);
        r2.neemOp(50.00);
        r3.stort(5987654.98);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3);
    }
}
