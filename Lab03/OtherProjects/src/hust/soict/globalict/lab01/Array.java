package hust.soict.globalict.lab01;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " +(i + 1) +":");
            array[i] = sc.nextInt();
            sum += array[i];

        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Trung binh cong cua cac phan tu la: "+ (double)sum/n);
    }
}
