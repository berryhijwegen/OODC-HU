package zelfstudieopdrachten.zelfstudie1;

public class Zelfstudie1 {
    public Zelfstudie1(){

    }

    public void forLoop(){
        // Opdracht 1
        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }
    }

    public void whileLoop(){
        // Opdracht 2
        int i = 1;
        while(i < 11){
            System.out.println(i);
            i++;
        }
    }
    public void randomNums(){
        // Opdracht 3
        for(int i = 0; i < 11; i++){
            System.out.println(Math.random());
        }
    }
    public void sumNums(){
        // Opdracht 4
        int som = 0;
        for(int i = 0; i < 40; i++){
            som+= i;
        }
        System.out.println(som);
    }

    public void zaag(){
        //Opdracht 5
        String str = "s";
        for(int i = 0; i < 4; i++){
            System.out.println(str);
            if (str == "ss"){
                str = "s";
            }
            else{
                str = "ss";
            }
        }
    }
}
