package ArrayDS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution1 {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {


        int sum = -63 ;// As  -9 < = a [i][j] >= 9;

        for (int r = 0; r < 4; r++) {

            for (int c = 0; c < 4; c++) {

                int asum = arr[r][c] + arr[r][c + 1] + arr[r][c + 2] + arr[r + 1][c + 1] +
                        arr[r + 2][c] + arr[r + 2][c + 1] + arr[r + 2][c + 2];

                if (asum > sum) {
                    sum = asum;
                }
            }
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
