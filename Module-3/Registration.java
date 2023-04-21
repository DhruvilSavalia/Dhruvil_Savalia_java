

	import java.awt.Button;
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.ItemEvent;
	import java.awt.event.ItemListener;
	import java.awt.event.WindowAdapter;
	import java.awt.event.WindowListener;
	import java.security.AllPermission;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	import javax.swing.ButtonGroup;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JRadioButton;
	import javax.swing.JTable;
	import javax.swing.JTextField;
	import javax.swing.table.DefaultTableModel;
	import javax.swing.JScrollPane;
	import javax.swing.JSlider;
	import javax.swing.JScrollBar;

	public class Registration extends WindowAdapter implements ActionListener
	{
		JFrame frame;
		JLabel l1,l2,l3,l4,l5,l6;
		JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
		JButton b1,b2,b3,b4,b5,b6;
		JRadioButton rb1,rb2;
		private JTable table;
		private JScrollPane scrollPane;
		private JFrame updateframe,deleteframe;
		JTextField tfid,tfid1;
		JButton btnedit,btnupdate,btndelete;
		JPanel jp,jp2;
		JTextField t1,t2,t3,t4;
		int a;

		
		
		
		public Registration()
		{
			
			
	       frame = new JFrame();
	      frame.addWindowListener(this);
	      frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			l1 = new JLabel("Registration Form");
			l1.setBounds(108, 23, 131, 22);
			
			l2 = new JLabel("ID");
			l2.setBounds(16, 86, 70, 22);
			
			l3 = new JLabel("Name");
			l3.setBounds(16, 128, 70, 22);
			
			l4 = new JLabel("Gender");
			l4.setBounds(16, 286, 70, 22);
			
			l5 = new JLabel("Address");
			l5.setBounds(16, 178, 70, 22);
			
			l6 = new JLabel("Contact");
			l6.setBounds(18, 230, 70, 29);
			
			tf1 = new JTextField();
			tf1.setBounds(98, 78, 162, 38);
			
			tf2 = new JTextField();
			tf2.setBounds(98, 120, 162, 38);
			
			tf3 = new JTextField();
			tf3.setBounds(98, 170, 162, 38);
			
			tf4 = new JTextField();
			tf4.setBounds(98, 227, 162, 38);
			
			tf5 = new JTextField();
			tf5.setBounds(0, 0, 0, 0);
			
			b1 = new JButton("Exit");
			b1.setBounds(16, 346, 117, 29);
			
			b2 = new JButton("Register");
			b2.setBounds(158, 346, 117, 29);
			
			b3 = new JButton("Delete");
			b3.setBounds(16, 387, 117, 29);
			
			b4 = new JButton("Update");
			b4.setBounds(158, 387, 117, 29);
			
			b5 = new JButton("Reset");
			b5.setBounds(85, 428, 117, 29);
			
			b6 = new JButton("Refresh Table");
			b6.setBounds(479, 428, 300, 29);
			
			rb1 = new JRadioButton("Male");
			rb1.setBounds(98, 285, 64, 23);
			
			rb2 = new JRadioButton("Female");
			rb2.setBounds(174, 285, 84, 23);
			
			ButtonGroup bg = new ButtonGroup();
			bg.add(rb1);
			bg.add(rb2);
			
			
			frame.getContentPane().setLayout(null);
			frame.setSize(1000, 500);
			frame.setVisible(true);
			frame.add(l1);
			frame.add(l2);
			frame.add(l3);
			frame.add(l4);
			frame.add(l5);
			frame.add(l6);
			frame.add(tf1);
			frame.add(b4);
			frame.add(tf2);
			frame.add(tf3);
			frame.add(tf4);
			frame.add(tf5);
			frame.add(b1);
			frame.add(b2);
			frame.add(b3);
			frame.add(b5);
			frame.add(rb1);
			frame.add(rb2);
			frame.add(b6);
			
			scrollPane = new JScrollPane();
			scrollPane.setBounds(300, 86, 641, 334);
			frame.getContentPane().add(scrollPane);
			
			b2.addActionListener(this);
			rb1.addActionListener(this);
			rb2.addActionListener(this);
			
			b5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					tf4.setText("");
				}
			});
			
			
			table = new JTable();
			scrollPane.setViewportView(table);
			table.setModel(new DefaultTableModel( new Object [][] {
	            
	        },
	        new String [] {
	            "SNO", "ID", "NAME", "GENDER", "ADDRESS", "CONTACT"
	        }));
			
			JScrollBar scrollBar = new JScrollBar();
			scrollPane.setRowHeaderView(scrollBar);
			
			
			
			b4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					updateframe = new JFrame();
					tfid =new JTextField(10);
					tfid.setBounds(98, 78, 162, 38);
					btnedit =new JButton("Edit");
					btnedit.setBounds(98, 90, 162, 38);
					
					jp =new JPanel();
					
					jp2=new JPanel();
					
					t1 =new JTextField(10);
					t1.setBounds(98, 78, 162, 38);
					t2 =new JTextField(10);
					t2.setBounds(98, 120, 162, 38);
					t3 =new JTextField(10);
					t3.setBounds(98, 170, 162, 38);
					t4 = new JTextField(10);
					t4.setBounds(98, 227, 162, 38);
					
					
					btnupdate =new JButton("Update");
					btnupdate.setBounds(98,215, 162, 38);
					
					btnedit.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							String host="jdbc:mysql://localhost:3306/";
							String db="JDBC";
							String url =host+db;
							
							try 
							{
								Class.forName("com.mysql.jdbc.Driver");
								Connection con= DriverManager.getConnection(url,"root","");
								
								String id = tfid.getText().toString();
								int id2= Integer.parseInt(id);
								
								String sql ="select * from registration where id='"+id2+"'";
								
								Statement stmt=con.createStatement();
								ResultSet set =stmt.executeQuery(sql);
								
								if(set.next())
								{
									
									
									int id3 =set.getInt(1);
									String name =set.getString(2);
									String address =set.getString(3);
									String contact = set.getString(4);
									String gender= set.getString(5);
									
									jp2.setVisible(true);
									jp.setVisible(false);
									
									t1.setText(name);
									t2.setText(address);
									t3.setText(contact);
									t4.setText(gender);
									
									btnupdate.addActionListener(new ActionListener() {
										
										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											
											String name = t1.getText().toString();
											String address =t2.getText().toString();
											String contact = t3.getText().toString();
											String gender= t4.getText().toString();

											String host="jdbc:mysql://localhost:3306/";
											String db="JDBC";
											String url =host+db;
											
											try 
											{
												Class.forName("com.mysql.jdbc.Driver");
												Connection con= DriverManager.getConnection(url,"root","");
												String sql="Update registration set name = '"+name+"' , address ='"+address+"',Contact='"+contact+"',gender='"+gender+"' where id='"+id3+"'";
												
												Statement stmt =con.createStatement();
												
												int status = stmt.executeUpdate(sql);
												
												if(status>0)
												{
													updateframe.setVisible(false);
												}
												else
												{
													System.out.println("Errror");
												}
											} 
											catch (Exception e1) 
											{
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
											
										}
									});
								}

							} 
							catch (Exception e1)
							{
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
						}
					});
					jp2.add(t1);
					jp2.setSize(500, 500);
					jp2.add(t2);
					jp2.add(t3);
					jp2.add(t4);
					jp2.add(btnupdate);
					jp.add(tfid);
					jp.setSize(500, 500);
					jp.add(btnedit);
					jp.add(jp2);
					jp2.setVisible(false);
					updateframe.add(jp);
					updateframe.add(jp2);
					updateframe.setSize(500,500);
					updateframe.setLayout(null);
					updateframe.setVisible(true);
					
				}
				
			});
			
			b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					deleteframe = new JFrame();
					
					tfid1=new JTextField(10);
					btndelete = new JButton("DELETE");
					
					btndelete.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							String host="jdbc:mysql://localhost:3306/";
							String db="JDBC";
							String url =host+db;
							
							String id12 = tfid1.getText().toString();
							
							try 
							{
								Class.forName("com.mysql.jdbc.Driver");
								Connection con= DriverManager.getConnection(url,"root","");
								String sql ="delete from registration where id ='"+id12+"'";
								Statement stmt =con.createStatement();
								
								int delete =stmt.executeUpdate(sql);
								
								if(delete>0)
								{
									deleteframe.setVisible(false);
								}
								else
								{
									System.out.println("Errror");
								}
							} 
							catch (Exception e1)
							{
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					});
					deleteframe.add(tfid1);
					deleteframe.add(btndelete);
					deleteframe.setSize(500,500);
					deleteframe.setLayout(new FlowLayout());
					deleteframe.setVisible(true);
				}
			});
			
			b6.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String host="jdbc:mysql://localhost:3306/";
					String db="JDBC";
					String url =host+db;
					try 
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con= DriverManager.getConnection(url,"root","");
						Statement stmt =con.createStatement();
						String sql ="select *from registration";
						ResultSet rs = stmt.executeQuery(sql);
						
						while(rs.next()) 
						{
							String id= String .valueOf(rs.getInt("id"));
							String Sno = String.valueOf(rs.getInt("Sno"));
							String Name = rs.getString("Name");
							String gender = rs.getString("gender");
							String address = rs.getString("address");
							String contact= rs.getString("contact");
						
							String tbdata[]= {Sno,id,Name,gender,address,contact};
							DefaultTableModel tbmodel = (DefaultTableModel)table.getModel();
							tbmodel.addRow(tbdata);
							
							
						}
						
					} 
					catch (Exception e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				}
			});
			
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(JOptionPane.showConfirmDialog(frame, "ARE YOU SURE EXIT?","EXIT",JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION)
					{
						System.exit(0);
					}
					
					
				}
			});
		}
		
			
			
		
		public static void main(String[] args) 
		{
			new Registration();
			
		}
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub
			String Sno = tf1.getText();
			String id = tf1.getText();
			String Name = tf2.getText();
			String address = tf3.getText();
			String Contact = tf4.getText();
			String gender ="";
			
			
			
			if(e.getSource()==rb1)
			{
				gender ="Male";
			}
			if(e.getSource()==rb2)
			{
				gender ="Female";
			}
			
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","");
				String sql ="insert into registration values ('"+Sno+"','"+id+"','"+Name+"','"+address+"','"+Contact+"','"+gender+"')";
				Statement st =con.createStatement();
				int a = st.executeUpdate(sql);
				if(a>0)
				{
					System.out.println("Inserted");
				}
				else
				{
					System.out.println("Fail");
				}
				
			} 
			catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
	}



