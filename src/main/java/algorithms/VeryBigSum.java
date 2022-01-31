package algorithms;

//  In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
//
//  Function Description
//
//  Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
//
//  aVeryBigSum has the following parameter(s):
//
//  int ar[n]: an array of integers .
//  Return
//
//  long: the sum of all array elements
//  Input Format
//
//  The first line of the input consists of an integer .
//  The next line contains  space-separated integers contained in the array.
//
//  Output Format
//
//  Return the integer sum of the elements in the array.
//
//  Constraints
//  1 < n <= 10
//  0 <= ar[i] <= 10^10
//

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class VeryBigSum {

    public VeryBigSum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira números de 10 casas para serem somados separados por vírgula");

        String numbers = scan.nextLine();
        long[] ar = Arrays.stream(numbers.split(",")).mapToLong(Long::parseLong).toArray();
        scan.close();

        aVeryBigSum(ar);
    }

    private void aVeryBigSum(long[] ar) {
        Scanner scan = new Scanner(System.in);
        long result = 0;

        Iterator<Long> it = Arrays.stream(ar).iterator();

        while (it.hasNext()){
            result += it.next();
        }

        System.out.println(result);
    }
}
