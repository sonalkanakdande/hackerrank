package JavaMD5;

import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.nio.charset.Charset;


public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      String s = in.nextLine ();
      in.close();

      try{
            MessageDigest messageDigest //SHA-256
                = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(s.getBytes());
            byte[] hash = messageDigest.digest();

            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
 
      }catch (Exception e){

      }
    }
}

