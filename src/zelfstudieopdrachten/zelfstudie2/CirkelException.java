package zelfstudieopdrachten.zelfstudie2;

public class CirkelException extends Exception {
    private String str1;

    public CirkelException(String str2){
        str1 = str2;
    }

    public String toString(){
        return String.format("CirkelException Occured: %s", str1);
    }
}
