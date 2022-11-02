import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.io.FileOutputStream;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class RegistrationForm  implements ItemListener,ActionListener
{
	JFrame frame;
	JComboBox cb1,cb2,cb3;
	JRadioButton rb1,rb2;
	JPasswordField pass1,pass2;
	JButton btn;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JTextField tf1,tf2,tf3,tf4,tf5;
	String courses[] = {"BBA","Bsc IT","BCA"};
	String branches[] = {"Computer Science And Engineering","Information Technology","Software Engineering","Information systems"};
	String semester[] = {"1","2","3","4","5"};
	String gender;
	
	public RegistrationForm()
	{
		frame = new JFrame();
		
		l1 = new JLabel("Registration Form");
		l1.setBounds(155,21,150,16);
		
		l2 = new JLabel("NAME");
		l2.setBounds(16, 86, 90, 16);
		
		l3 = new JLabel("SURNAME");
		l3.setBounds(16, 123, 90, 16);
		
		l4 = new JLabel("DATE OF BIRTH");
		l4.setBounds(16, 161, 90, 16);
		
		l5 = new JLabel("MOBILE NO");
		l5.setBounds(16, 205, 90, 16);
		
		tf1 = new JTextField();
		tf1.setBounds(129, 86, 130, 26);
		
		tf2 = new JTextField();
		tf2.setBounds(129, 118, 130, 26);
		
		tf3 = new JTextField();
		tf3.setBounds(129, 156, 130, 26);
		
		tf4 = new JTextField();
		tf4.setBounds(129, 200,130,26);
		
		l11 = new JLabel("GENDER");
		l11.setBounds(16, 252, 90, 16);
		
		rb1 = new JRadioButton("MALE");
		rb1.setBounds(140, 252, 90, 16);
		
		rb2 = new JRadioButton("FEMALE");
		rb2.setBounds(230, 252, 90, 20);
		
		l6 = new JLabel("PASSWORD");
		l6.setBounds(16, 298, 99, 16);
		
		pass1 = new JPasswordField();
		pass1.setBounds(129, 293, 136, 26);
		
		l7 = new JLabel("RE-PASSWORD");
		l7.setBounds(16, 339, 99, 16);
		
		pass2 = new JPasswordField();
		pass2.setBounds(129, 334, 136, 26);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		l8 = new JLabel("COURSES");
		l8.setBounds(16, 376, 90, 16);
		
		cb1 = new JComboBox<>(courses);
		cb1.setBounds(129, 372, 150, 27);
		
		l9 = new JLabel("BRANCHES");
		l9.setBounds(16, 415, 90, 16);
		
		cb2 = new JComboBox<>(branches);
		cb2.setBounds(127, 411, 150, 27);
		
		l10 = new JLabel("SEMESTER");
		l10.setBounds(16, 454, 90, 16);
		
		cb3 = new JComboBox<>(semester);
		cb3.setBounds(129, 450, 150, 27);
		
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		
		btn = new JButton("REGISTER");
		btn.setBounds(150,500, 200, 29);
		
		btn.addActionListener(this);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		
		
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(tf4);
		frame.add(rb1);
		frame.add(rb2);
		frame.add(l6);
		frame.add(l7);
		frame.add(pass1);
		frame.add(pass2);
		frame.add(l8);
		frame.add(l9);
		frame.add(l10);
		frame.add(l11);
		frame.add(cb1);
		frame.add(cb2);
		frame.add(cb3);
		frame.add(btn);
	}
	public static void main(String[]args) 
	{
		new RegistrationForm();
		
		
		
	}
		

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getSource()==rb1)
		{
			gender = "MALE";
		}
		if(e.getSource()==rb2)
		{
			gender = "FEMALE";
		}
		if(e.getSource()==cb1)
		{
			System.out.println("\nYour Course is : "+cb1.getItemAt(cb1.getSelectedIndex()));
		}
		if(e.getSource()==cb2)
		{
			System.out.println("\nYour Branch is : "+cb2.getItemAt(cb2.getSelectedIndex()));
		}
		if(e.getSource()==cb3)
		{
			System.out.println("\nYour Semester is : "+cb3.getItemAt(cb3.getSelectedIndex()));
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String NAME = tf1.getText().toString();
		String SURNAME= tf2.getText().toString();
		String DATE_OF_BIRTH = tf3.getText().toString();
		String MOBILE_NO = tf4.getText().toString();
		//String GENDER = tf11.getText().toString();
		String data=gender;
		System.out.println(NAME+" "+SURNAME+" "+DATE_OF_BIRTH+" "+MOBILE_NO+" "+data);
		
		try
		{
			FileOutputStream fout = new FileOutputStream("c:/users/admin/desktop/file.txt/");
			String name1 = "\nYour name is :";
			fout.write(name1.getBytes());
			fout.write(NAME.getBytes());
			
			String surname1 = "\nYour surname is:";
			fout.write(surname1.getBytes());
			fout.write(SURNAME.getBytes());
			
			String date_of_birth ="\nYour date_of_birth is:";
			fout.write(date_of_birth.getBytes());
			fout.write(DATE_OF_BIRTH.getBytes());
			
			String mobile_no1 ="\nYour mobile_no is:";
			fout.write(mobile_no1.getBytes());
			fout.write(MOBILE_NO.getBytes());
			
			String gender1 ="\n Your gender is :";
			fout.write(gender1.getBytes());
			fout.write(data.getBytes());
		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}
		       System.out.println("success");
		}
}
		
	
	