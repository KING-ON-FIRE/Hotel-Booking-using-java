package project;
import javax.swing.*;
public class Frame2 {

	Frame2(String s){
		JFrame f1 = new JFrame("Confirmation");
		JLabel e = new JLabel(s);
		f1.add(e);
		f1.setSize(400,300);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
