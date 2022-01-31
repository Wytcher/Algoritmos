import algorithms.SimpleArraySum;
import algorithms.TimeConversion;
import algorithms.VeryBigSum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma opção para iniciar um algoritmo:");
        System.out.println("1 - Simple Array Sum");
        System.out.println("2 - Time Conversion");
        System.out.println("3 - Very Big Sum");

        int number = scan.nextInt();

        switch (number){
            case 1:
                new SimpleArraySum();
                break;
            case 2:
                new TimeConversion();
                break;
            case 3:
                new VeryBigSum();
                break;
        }
    }
}
