package Assignment3_String;

import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            str1 = str.charAt(i) + str1;
        }
        System.out.println(str1);


	}

}
