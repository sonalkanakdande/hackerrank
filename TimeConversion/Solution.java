package TimeConversion;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String formattedTime = s;
        int len = s.length();
        String deflt = "00";
        String ampm= s.substring(len-2);
        String time = s.substring(0,len-2);
        StringJoiner stringJoiner = new StringJoiner(":");
        String[] value_split = time.split(":");
        int hours = Integer.parseInt(value_split [0]);
        if (ampm.equalsIgnoreCase("PM")){
            hours = Integer.parseInt(value_split [0])+12;
          if (hours != 24)
          {
              deflt = hours+"";
          }else{
              deflt = 12+"";
          }

        } else {

            if (hours != 12)
            {
                deflt = hours+"";
            }
        }
        value_split[0]= deflt+"";
        for (int i =0; i <value_split.length; i++){
            if (value_split[i].length()==1){
                value_split[i]=0 +value_split[i];
            }
            stringJoiner.add(value_split[i]);
        }
        formattedTime =  stringJoiner.toString();

        return formattedTime;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = "06:40:03AM";
        String result = timeConversion(s);
        System.out.println(result);
       /* bw.write(result);
        bw.newLine();


        bw.close();*/
    }
}
