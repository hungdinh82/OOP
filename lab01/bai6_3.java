package lab01;

import javax.swing.JOptionPane;

public class bai6_3 {
	public static void main(String[] args) {
		String n;
		
		n = JOptionPane.showInputDialog(null, "Please enter n:", "Please input the number: ", JOptionPane.INFORMATION_MESSAGE);
		double x = Double.parseDouble(n);
		
		for(int i = 1; i <= x; i++) {
		      for(int j = 1; j <= x-i; j++)
		    	  System.out.print(" ");
		 
		      for(int j = 1; j <= i; j++)
		    	  System.out.print("* ");
		 
		      System.out.print("\n");
		}
	}
}
