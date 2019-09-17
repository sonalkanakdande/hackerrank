package StringSimilarity;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the stringSimilarity function below.
    static long stringSimilarity(String s) {

        int Z[] = new int[s.length()];
        int left =0;
        int right = 0;
        for (int k =1; k< s.length(); k++){

            if (k>right){
                left= right = k;
                while (right<s.length() && s.charAt(right) == s.charAt(right-left)){
                    right++;
                }
                Z[k] = right- left;
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
                    Z[k] = right- left;
                    right--;
                }
            }

        }
        long totalScore = 0;
        for (int index = 0; index < Z.length ; index++) {
            totalScore += Z[index];
        }
        return totalScore+s.length();

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            long result = stringSimilarity(s);
            System.out.println(result);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
