import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;



import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCombobox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Student_registration implements ActionListener,ItemListener
{
	JFrame frame;
	JLabel l1,l2,l3,l4,l5;
	JButton btn1;
	JTextField tf1,tf2,tf3;
    JButton btn;
	JPasswordField tf4;
	String gender="";
    JComboBox cb1,cb2,cb3;
    JRadioBox rb1,rb2;
    String Courses[] = {"BBA","Bsc.IT","BCA"};
    String Branch[] = {"computer Science and Engineering","Software Engineering","Information Systems","Information Technology"};
    String Semester[] = {"1","2","3","4","5"};
	private Component l6;
	private Object Branches;
	
	public Student_registration()
	{
		frame = new JFrame();
		l1 = new JLabel("Registration form");
		l1.setBounds(155, 21, 150,10);
		
		l2 = new JLabel("Name");
		l2.setBounds(90, 21, 150, 10);
		
		l3 = new JLabel("Surname");
		l3.setBounds(70, 21, 150, 10);
		
		l4 = new JLabel("DOB");
		l4.setBounds(30, 21, 150, 10);
		
		l5 = new JLabel("Mobile no");
		l5.setBounds(20, 21, 150, 10);
		
		 l6 = new JLabel("Gender");
		l6.setBounds(10,164,66,14);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(275,130,70,23);
		
		tf1 = new JTextField();
		tf2.setBounds(10, 21, 150, 10);
		
		tf2 = new JPasswordField();
		tf2.setBounds(5, 21, 150, 10);
		
		 register = new JButton("REGISTER");
		register.setBounds(135,200,173,20);
		
		cb1 = new JComboBox<>(Courses);
		cb1.setBounds(135,200,173,20);
		
		cb2 = new JComboBox<>(Branches);
		cb2.setBounds(125, 200, 173, 20);
		
		cb3 = new JComboBox<>(Semester);
		cb3.setBounds(110, 200, 173, 20);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		
		
		
		 btn = new JButton("Register");
		 btn.setBounds(69, 21, 150, 10);
		
		 btn.addActionListener((ActionListener) new ActionListener() 
				 {
			 
				 
				 public void actionPerformed(ActionEvent e)
				 {
		            String uname = tf1.getText().toString();
		            String pass = tf2.getText().toString();
		            
		            if(pass.equals("1234"))
		            {
		            	System.out.println("success");
		            }
		            else
		            {
		            	System.out.println("Re-password");
		            }
				 }
				 });
		       frame.add(l1);
		       frame.add(l2);
		       frame.add(l3);
		       frame.add(l4);
		       frame.add(l5);
		       frame.add(tf1);
		       frame.add(tf2);
		       frame.add(tf3);
		       frame.add(tf4);
		       frame.add(btn);
		       frame.setSize(500,500);
			   frame.layout();
		       frame.setVisible(true);
		
		
	}

	public static void main(String[] args) 
	{
      new Student_registration();	
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		String name = tf1.getText().toString();
		String Surname = tf2.getText().toString();
		String email = tf3.getText().toString();
		String password = tf4.getText().toString();
		
		
		System.out.println(name+" "+Surname" "+email+ " "+MobileNo" "+Password" "+Re-Password");"
			
	
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==rb1)
		{
			gender = "Male";
		}
		if(e.getSource()==rb2)
		{
			gender = "Female";
		}
		if(e.getSource()==cb1)
		{
			System.out.println("Your Course is:"+cb1.getItemAt(cb1.getSelectedIndex()));
		}
		if(e.getSource()==cb2)
		{
			System.out.println("Your Branch is:"+cb2.getItemAt(cb2.getSelectedIndex()));
		}
		if(e.getSource()==cb3)
		{
			System.out.println("Your Semester is:"+cb3.getItemAt(cb3.getSelectedIndex()));
		}
	}

}
