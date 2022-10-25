package lab01;

import javax.swing.JOptionPane;

public class bai2_2_5 {
	public static void main(String[] args) {
		String a,b;
		String Notification = "You've just entered: ";
		
		a = JOptionPane.showInputDialog(null, "Please enter a:", "Please input the first number: ", JOptionPane.INFORMATION_MESSAGE);
		Notification += a + " and";
		
		b = JOptionPane.showInputDialog(null, "Please enter b:", "Please input the first number: ", JOptionPane.INFORMATION_MESSAGE);
		Notification += b ;
		
		JOptionPane.showMessageDialog(null, Notification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		
		double c = Double.parseDouble(a);
		double d = Double.parseDouble(b);
		
		JOptionPane.showMessageDialog(null, c + d, "a + b =", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, c - d, "a - b =", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, c * d, "a * b =", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, c / d, "a / b =", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
		
	}
}
