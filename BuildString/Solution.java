package BuildString;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the buildString function below.
     */
    static int buildString(int a, int b, String s) {
        /*
         * Write your code here.
         */
        int Z[] = new int[s.length()];
        int left =0;
        int right = 0;
        Z[0] = a;
        for (int k =1; k< s.length(); k++){

            if (k>right){
                left= right = k;
                while (right<s.length() && s.charAt(right) == s.charAt(right-left)){
                    right++;
                }
                if (right- left>=2){
                    Z[k] = b;
                }else {
                    Z[k] = a;
                }

                right--;
            }else {
                int k1 = k-left;
                if (Z[k1] <right-k+1){
                    Z[k] = Z[k1];
                }else{
                    left = k;
                    while (right<s.length() && s.charAt(right) == s.charAt(right-left)){
                        right++;
                    }
                    if (right- left>2){
                        Z[k] = b;
                    }else {
                        Z[k] = a;
                    }
                    right--;
                }
            }

        }

        int totalScore = 0;
        for (int index = 0; index < Z.length ; index++) {
            totalScore += Z[index];
        }
        return totalScore;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nab = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nab[0].trim());

            int a = Integer.parseInt(nab[1].trim());

            int b = Integer.parseInt(nab[2].trim());

            String s = scanner.nextLine();

            int result = buildString(a, b, s);
            System.out.println(result);
        }

//        bufferedWriter.close();
    }
}
