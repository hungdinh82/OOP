package hust.soict.globalict.swing;


import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {
	private TextField tfInput;
	private TextField tfOutput;
	private int sum = 0;
	
	public AWTAccumulator() {
		setLayout(new GridLayout(2, 2));
		
		add(new Label("Enter an Integer: "));
		
		tfInput = new TextField(10);
		add(tfInput);
		tfInput.addActionListener((ActionListener) new TFInputListener());
		
		add(new Label("The Accumulated Sum is: "));
		
		tfOutput = new TextField(10);
		tfOutput.setEditable(false);
		
		add(tfOutput);
		
		setTitle("AWT Accumulator");
		setSize(350, 120);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new AWTAccumulator();
	}
	
	private class TFInputListener implements ActionListener {
		public void actionPerformed1(ActionEvent evt) {
			int numberIN = Integer.parseInt(tfInput.getText());
			sum += numberIN;
			tfInput.setText("");
			tfOutput.setText(sum + "");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}
