package JavaOutputFormatting;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                String threeDigits ="";
                if (x<=99 && x>=10){
                  threeDigits = "0"+x; 
                }else if (x>=0 && x<=9)
                {
                    threeDigits = "00"+x; 
                }else{
                    threeDigits =""+x;
                }
                
                System.out.println(String.format("%-"+15+"s",s1)+threeDigits);
            }
            System.out.println("================================");

    }
}



