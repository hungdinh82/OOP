package hust.soict.globalict.lab01;

import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhap so hang va so cot cua 2 ma tran: ");
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        double[][] matrix1 = new double[x][y];
        double[][] matrix2 = new double[x][y];
        System.out.println("Nhap ma tran 1: ");
        for(int i = 0; i< x; i++) {
            for(int j = 0; j < y; j++) {
                matrix1[i][j] = keyboard.nextDouble();
            }
        }
        System.out.println("Nhap ma tran 2: ");
        for(int i = 0 ; i < x;i++) {
            for(int j = 0; j < y;j++) {
                matrix2[i][j] = keyboard.nextDouble();
            }
        }
        System.out.println("Tong 2 ma tran la: ");
        for(int i = 0; i < x;i++) {
            for(int j = 0;j < y;j++) {
                System.out.print(matrix1[i][j] + matrix2[i][j]+" ");
            }
            System.out.print("\n");
        }
        keyboard.close();
    }
}
