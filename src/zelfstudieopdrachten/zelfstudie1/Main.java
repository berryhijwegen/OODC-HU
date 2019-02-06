package zelfstudieopdrachten.zelfstudie1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // Opdracht 1
        System.out.println("Opdracht 1:");
        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }

        // Opdracht 2
        System.out.println("\nOpdracht 2:");
        int i = 0;
        while(i < 11){
            System.out.println(i);
            i++;
        }

        // Opdracht 3
        System.out.println("\nOpdracht 3:");
        for(i = 0; i < 11; i++){
            System.out.println(Math.random());
        }

        // Opdracht 4
        System.out.println("\nOpdracht 4:");
        int som = 0;
        for(i = 0; i < 40; i++){
            som+= i;
        }
        System.out.println(som);

        //Opdracht 5
        System.out.println("\nOpdracht 6:");
        String str = "s";
        for(i = 0; i < 4; i++){
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
