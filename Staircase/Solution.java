package Staircase;

import java.time.LocalDate;
import java.util.Scanner;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {

        StringBuilder stair = new StringBuilder ();
        for (int i = 0; i <n ; i++ ){
            stair.append(" ");
        }
        for (int j = 1; j < n+1 ; j++){
            stair.setCharAt (n-j, '#');
            System.out.println(stair);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
