import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileOutputStream;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.EventQueue;
import java.awt.Window;

public class signup_form implements ItemListener,ActionListener 
{
	JFrame frame;
	JLabel l1,l2,l3,l4,l5;
	static JTextField tf1;
	static JTextField tf2;
	static JTextField tf3;
	static JPasswordField pass1;
	JButton btn;

	
	
	public signup_form()
	{
		frame = new JFrame();
		
		l1 = new JLabel("Signup form");
        l1.setBounds(155, 21, 150, 16);
        
        l2 = new JLabel("Firstname");
        l2.setBounds(16, 86, 90, 16);
        
        l3 = new JLabel("Lastname");
        l3.setBounds(16, 123, 90, 20);
        
        l4 = new JLabel("Email ID");
        l4.setBounds(16, 165, 90, 16);
        
        tf1 = new JTextField();
        tf1.setBounds(150, 81, 130, 20);
        
        tf2 = new JTextField();
        tf2.setBounds(150, 120, 130, 20);
        
        tf3 = new JTextField();
        tf3.setBounds(150, 160, 130, 20);
        
        //tf4 = new JTextField();
       // tf4.setBounds(150,190,130,26);
        
        l5 = new JLabel("Password");
        l5.setBounds(16,200,90,20);
      
        pass1 = new JPasswordField();
        pass1.setBounds(150, 203, 130, 20);
        
        ButtonGroup bg = new ButtonGroup();
        
        btn = new JButton("Signup");
        btn.setBounds(80, 260, 157, 29);
        
        btn.addActionListener(this);
        
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
       // frame.add(tf4);
        frame.add(pass1);
        frame.add(btn);
	}
	public static void main(String[]args)
	{
		
		new signup_form();
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
	
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		String Firstname = tf1.getText().toString();
		String Lastname = tf2.getText().toString();
		String email = tf3.getText().toString();
	    String password = pass1.getText().toString();
		System.out.println(Firstname+ " "+Lastname+ " "+email+ " "+password );	
		
	}
	
}
		
		