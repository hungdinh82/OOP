package hust.soict.globalict.lab01;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for(int k = 1; k <= n-i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
