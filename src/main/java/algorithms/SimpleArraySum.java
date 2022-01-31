package algorithms;

//  Given an array of integers, find the sum of its elements.
//
//  For example, if the array ar = [1,2,3] , 1 + 2 + 3 = 6, so return 6.
//
//  Function Description
//
//  Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.
//
//  simpleArraySum has the following parameter(s):
//
//  ar: an array of integers
//  Input Format
//
//  The first line contains an integer, N, denoting the size of the array.
//  The second line contains N space-separated integers representing the array's elements.
//
//  Constraints
//
//  0 < N, ar[i] <= 1000
//
//  Output Format
//
//  Print the sum of the array's elements as a single integer.

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArraySum {

    public SimpleArraySum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe uma sequência de números para serem somados separados por vírgula");

        String numbers = scan.nextLine();
        int[] ar = Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).toArray();
        scan.close();

        arraySum(ar);
    }

    private void arraySum(int[] ar){
        int sum = 0;

        for (Integer item: ar){
            sum += item;
        }

        System.out.println(sum);
    }
}
