package algorithms;

import java.util.Scanner;

//  You are choreographing a circus show with various animals. For one act, you are given two
//  kangaroos on a number line ready to jump in the positive direction (i.e, toward positive
//  infinity).
//
//  The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
//  The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
//
//  You have to figure out a way to get both kangaroos at the same location at the same time as part
//  of the show. If it is possible, return YES, otherwise return NO.
//
//  For example, kangaroo 1 starts at x1 = 2 with a jump distance v1 = 1 and kangaroo 2 starts at
//  x2 = 1 with a jump distance of v2 = 2. After one jump, they are both at x = 3, (x1 + v1 = 2 +
//  1, x2 + v2 = 1 + 2), so our answer is YES.
//
//  Function Description
//
//  Complete the function kangaroo in the editor below. It should return YES if they reach the same
//  position at the same time, or NO if they don't.
//
//  kangaroo has the following parameter(s):
//
//      x1, v1: integers, starting position and jump distance for kangaroo 1
//      x2, v2: integers, starting position and jump distance for kangaroo 2
//
//  Input Format
//
//  A single line of four space-separated integers denoting the respective values of x1, v1, x2
//  and v2.
//
//  Constraints
//   0 <= x1 < x2 <= 10000
//   1 <= v1 <= 10000
//   1 <= v2 <= 10000
//
//  Output Format
//  Print YES if they can land on the same location at the same time; otherwise, print NO.
//
//  Note: The two kangaroos must land at the same location after making the same number of jumps.
//
//  Examples
//  0 3 4 2 => YES
//  0 2 5 3 => NO


public class LineJumps {

    public LineJumps(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a posição do primeiro canguru:");
        int x1 = scan.nextInt();
        System.out.println("Insira a o pulo do primeiro canguru:");
        int v1 = scan.nextInt();

        System.out.println("Insira a posição do segundo canguru:");
        int x2 = scan.nextInt();
        System.out.println("Insira a o pulo do segundo canguru:");
        int v2 = scan.nextInt();
        scan.close();

        lineJumps(x1,v1,x2,v2);
    }

    private void lineJumps(int x1, int v1, int x2, int v2){
        if ((v1 <= v2)) {
            System.out.println("NO");
            return;
        } else {
            for (int i = 0; i < v1 * x2; i++) {
                if (x1 + (v1*i) == x2 + (v2 * i)){
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
