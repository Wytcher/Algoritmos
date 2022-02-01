import algorithms.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma opção para iniciar um algoritmo:");
        System.out.println("1 - Simple Array Sum");
        System.out.println("2 - Time Conversion");
        System.out.println("3 - Very Big Sum");
        System.out.println("4 - Compare Triplets");
        System.out.println("5 - Lonely Number");
        System.out.println("6 - Grading Students");

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
            case 4:
                new CompareTriplets();
                break;
            case 5:
                new LonelyNumber();
                break;
            case 6:
                new GradingStudents();
                break;
        }
    }
}
