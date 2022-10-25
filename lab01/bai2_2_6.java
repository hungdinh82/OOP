package lab01;
import javax.swing.JOptionPane;

public class bai2_2_6 {
	public static void main(String[] args) {
		String a,b;
		String Notification = "A first-degree equation with one variable can have a form such as: ";
		String Error1 = "Error\n";
		double c;
		
		do
	    {
			a = JOptionPane.showInputDialog(null, "Please enter a:", "Please input the first number: ", JOptionPane.INFORMATION_MESSAGE);
	        c = Double.parseDouble(a);
	        if(c <= 0)
	        {
	        	JOptionPane.showMessageDialog(null, "Please enter a again: ", Error1, JOptionPane.INFORMATION_MESSAGE);
	        }
	    }
	    while (c <= 0); 
		
		Notification += a + "x + ";
		
		b = JOptionPane.showInputDialog(null, "Please enter b:", "Please input the first number: ", JOptionPane.INFORMATION_MESSAGE);
		Notification += b + " = 0";
		
		JOptionPane.showMessageDialog(null, Notification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		
		double d = Double.parseDouble(b);
		
		JOptionPane.showMessageDialog(null, -d / c, "Result", JOptionPane.INFORMATION_MESSAGE);
		
		
	}
}
