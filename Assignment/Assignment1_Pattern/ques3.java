package Assignment1_Pattern;

import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i + j <= n / 2 || j - i >= (n + 1) / 2)
                    System.out.print("*");
                else

                    System.out.print(" ");
            }
            System.out.println();
        }


	}

}
