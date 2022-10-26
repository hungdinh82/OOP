package lab01;
import javax.swing.JOptionPane;

public class bai2_2_6 {
	public static void main(String[] args) {
		String a,b;
		String Notification = "A first-degree equation with one variable can have a form such as: ";
		String Error1 = "Error\n";
		double c;
		
		a = JOptionPane.showInputDialog(null, "Please enter a:", "Please input the first number: ", JOptionPane.INFORMATION_MESSAGE);
        c = Double.parseDouble(a);
		
		Notification += a + "x + ";
		
		b = JOptionPane.showInputDialog(null, "Please enter b:", "Please input the first number: ", JOptionPane.INFORMATION_MESSAGE);
		Notification += b + " = 0";
		
		JOptionPane.showMessageDialog(null, Notification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		
		double d = Double.parseDouble(b);
		
		if (c == 0 & d == 0) {
			JOptionPane.showMessageDialog(null, "Equation with infinite solutions.", "Result", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		
		if (c == 0 & d != 0) {
			JOptionPane.showMessageDialog(null, "The equation has no solution.", "Result", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		
		JOptionPane.showMessageDialog(null, -d / c, "Result", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
	}
}
