import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab5 extends lab4 implements ActionListener {

	public void init() {

		super.init();
		order.setVisible(false);
		changeMaker.setVisible(false);
		placeOrder1.addActionListener(this);
	}
	public void displayResult() {
		int pos = cbb.getSelectedIndex();
		String s = (String) cbb.getSelectedItem();
		nameTF.setForeground(colore.RED);
		nameTF.setText(",a,a,");
	
	public void actionPerformed(ActionEvent arg0) {
		
	}
}