package AlphaAndBeta;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'alphaBeta' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY pile as parameter.
     */

    public static int alphaBeta(List<Integer> pile) {
    // Write your code here
        SortedSet newPile = new TreeSet(pile);
        if(newPile.size()==1)
            return 0;
        int maxNumber  = (int)((TreeSet) newPile).pollLast();
        if (newPile.size() == 0)
            return maxNumber;
        return (int) ((TreeSet) newPile).pollLast();

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] pileTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> pile = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int pileItem = Integer.parseInt(pileTemp[i]);
            pile.add(pileItem);
        }

        int result = Result.alphaBeta(pile);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
