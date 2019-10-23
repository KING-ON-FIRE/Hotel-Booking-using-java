package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Frame1 extends JFrame{
	private String name;
	private int age,date,month,year,num;
	private char g;
	Frame1(){
		JFrame f = new JFrame("Hotel Booking");
		JLabel l = new JLabel("<html>Welcome!! to KLU online hotel booking<br/></html>",JLabel.HORIZONTAL);
		f.setBackground(Color.red);
		ImageIcon ii = new ImageIcon("C:\\Users\\tpenu\\Desktop\\universitylogo.png");
		JLabel q = new JLabel(ii);
		q.setBounds(580, 0, 220, 210);
		f.add(q);
		f.add(l);
		l.setBounds(100, 100, 300, 20);
		JLabel l1 = new JLabel("Name");
		f.add(l1);
		l1.setBounds(200 , 250, 50 , 20);
		JTextField f1 = new JTextField(32);
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = f1.getText();
			}
		});
		f.add(f1);
		f1.setBounds(250 , 250, 400 , 20);
		JLabel l2 = new JLabel("Age");
		JTextField f2 = new JTextField(2);
		l2.setBounds(200 , 280, 50 , 20);
		f.add(l2);
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				age = Integer.parseInt(f2.getText());
			}
		});
		f.add(f2);
		f2.setBounds(250 , 280, 100 , 20);
		Integer d[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		Integer m[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		Integer y[] = {2019,2020,2021,2022};
		JLabel l5 = new JLabel("Date");
		f.add(l5);
		l5.setBounds(200 , 310, 50 , 20);
		JComboBox<Integer> dat = new JComboBox<Integer>(d);
		dat.setBounds(250 , 310, 100 , 20);
		JLabel l6 = new JLabel("Month");
		l6.setBounds(200 , 340, 50 , 20);
		JComboBox<Integer> mon = new JComboBox<Integer>(m);
		mon.setBounds(250 , 340, 100 , 20);
		JLabel l7 = new JLabel("Year");
		l7.setBounds(200 , 370, 50 , 20);
		JComboBox<Integer> yea = new JComboBox<Integer>(y);
		yea.setBounds(250 , 370, 100 , 20);
		date = Integer.parseInt(dat.getSelectedItem().toString());
		f.add(dat);
		f.add(l6);
		month = Integer.parseInt(mon.getSelectedItem().toString());
		f.add(mon);
		f.add(l7);
		year = Integer.parseInt(yea.getSelectedItem().toString());
		f.add(yea);
		JLabel l4 = new JLabel("Gender");
		l4.setBounds(200 , 400, 100 , 20);
		f.add(l4);
		String gen[] = {"MALE" , "FEMALE"};
		JComboBox<String> gender = new JComboBox<String>(gen);
		gender.setBounds(250 , 400, 100 , 20);
		switch(gender.getSelectedIndex()) {
		case 0 : g = 'm';
		break;
		case 1 : g = 'f';
		}
		f.add(gender);
		JLabel l3 = new JLabel("Number of persons");
		l3.setBounds(200 , 430, 150 , 20);
		f.add(l3);
		JTextField f3 = new JTextField(2);
		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(f3.getText().toString());
			}
		});
		f.add(f3);
		f3.setBounds(350 , 430, 100 , 20);
		JButton b = new JButton("Verify");
		b.setBounds(300,500, 100, 40);
		f.setSize(1370,790);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Verifier v = new Verifier();
				age = Integer.parseInt(f2.getText().toString());
				name = f1.getText();
				num = Integer.parseInt(f3.getText().toString());
				boolean a = v.verify(name,age,g,date,month,year,num); 
				if(a) {
					new Frame2("Your request for booking rooms is confirmed");
				}
				else new Frame2("Incorrect details!!!");
				new Write((name+"\n"+age+"\n"+g+"\n"+date+"\n"+month+"\n"+year+"\n"+num+"\n").toString());
			}
		});
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	}
}
