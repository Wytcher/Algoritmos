package algorithms;

//  Given an array of integers, where all elements but one occur twice, find the unique element.
//
//  Example
//  a = [1,2,3,4,3,2,1]
//
//  The unique element is 4.
//
//  Function Description
//
//  Complete the lonelyinteger function in the editor below.
//
//  lonelyinteger has the following parameter(s):
//
//  int a[n]: an array of integers
//  Returns
//
//  int: the element that occurs only once
//  Input Format
//
//  The first line contains a single integer, n, the number of integers in the array.
//  The second line contains  space-separated integers that describe the values in a.
//
//  Constraints
//  1 <= n < 100
//  It is guaranteed that n is an odd number and that there is one unique element.
//  0 <= a[i] <= 100, where = <= i < n.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LonelyNumber {

    public LonelyNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira uma sequencia de números aonde haja somente 1 número único");

        String numbers = scan.nextLine();
        int[] ar = Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).toArray();
        List<Integer> list = new ArrayList<>();
        for(int number: ar){
            list.add(number);
        }

        lonelyInteger(list);
        scan.close();
    }

    private void lonelyInteger(List<Integer> a) {
        // Write your code here
        int size = a.size();
        int lonelyNumber = 0;
        for(int number: a){
            int count = 0;
            for(int i = 0; i< size; i++){
                if(a.get(i) == number){
                    count++;
                }
            }
            if(count < 2){
                lonelyNumber = number;
                break;
            }
        }

        System.out.println(lonelyNumber);
    }
}
