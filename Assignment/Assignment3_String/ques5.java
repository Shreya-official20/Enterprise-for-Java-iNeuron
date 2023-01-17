package Assignment3_String;

//repeatedly occurring characters in the given String.

import java.util.*;

public class ques5 {
 public static void main(String[] args) {
     // TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     String str = sc.next();
     sc.close();
     int count = 0;
     for (int i = 0; i < str.length(); i++) {
         count = 0;
         for (int j = 0; j < str.length(); j++) {
             if (str.charAt(i) == str.charAt(j)) {
                 count++;
             }
         }
         System.out.println(str.charAt(i) + " " + count);
     }
 }
}
