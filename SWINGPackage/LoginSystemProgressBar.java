import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.text.html.*;

class LoginSystem extends JFrame implements ActionListener
{
    JLabel userlbl,passlbl;
    JTextField usertxt;
    JPasswordField passwrd;
    JPanel p1,p2;
    JButton Login,Cancel;
    Container c;
    Connection cn;
    ResultSet rs;
    PreparedStatement st;
    String sql;
    String msg;
    String u,p;
    char ch[];

boolean  b;
    final static int interval=100;
    int i;
    JProgressBar pb;
    JLabel lb;
    Timer timer;


   	public void MyConnection()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/LallyInfosysProject?autoReconnect=true&useSSL=true","vkunal1996","12345");
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(this,e);
        System.exit(0);
        }
    }
        public void Close()
        {
            try
            {
               cn.close();
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
        }
        
        LoginSystem()
        {
            c=getContentPane();
            setResizable(false);
            setTitle("LoginSystem");
            setSize(500,500);
            userlbl=new JLabel("Username");
            userlbl.setBounds(100,100,140,40);
            usertxt=new JTextField(20);
            usertxt.setBounds(190,100,140,30);
            passlbl=new JLabel("Password");
            passlbl.setBounds(100,150,140,40);
            passwrd=new JPasswordField(20);
            passwrd.setBounds(190,150,140,30);
            
            Login=new JButton("Login");
            Login.setBounds(100,200,130,30);
            
            Cancel=new JButton("Cancel");
            Cancel.setBounds(240,200,130,30);
            

            
            p1=new JPanel();
            p1.setSize(200,200);
            p1.setLayout(null);
            p1.setBounds(100,100,20,20);
            p1.setBackground(Color.white);
            p1.add(userlbl);p1.add(usertxt);
            p1.add(passlbl);p1.add(passwrd);
            p1.add(Login);p1.add(Cancel);
            
            
            /*Progress Bar*/
           
            pb=new JProgressBar(0,20);
            pb.setValue(0);
            pb.setMinimum(0);
            pb.setStringPainted(true);
            pb.setBounds(100,250,280,30);
            p1.add(pb);

            c.add(p1);
            addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
            System.exit(0);
            }
            });

            usertxt.addFocusListener(new FocusAdapter(){
            	public void focusGained(FocusEvent e)
            	{
            		pb.setVisible(true);
            		pb.setValue(0);
            	}
            });
                     
                      MyConnection();
                      Login.addActionListener(this);
                      Cancel.addActionListener(this);                     
                      timer = new Timer(interval, new ActionListener() {
            					public void actionPerformed(ActionEvent evt) {
								if (i == 20){
								Toolkit.getDefaultToolkit().beep();
								timer.stop();
								Login.setEnabled(true);
								pb.setValue(0);
								//JOptionPane.showMessageDialog(this.LoginSystem,msg);

								PrintMessage(msg,b);

								}
									i = i + 1;
                					pb.setValue(i);
            					}
        						});
            
        }
        public void PrintMessage(String msg,boolean b)
        {
        	JOptionPane.showMessageDialog(this,msg);
        	if(b==true)
        	{	
        	new Home(u).show();
        	        	this.setVisible(false);

        }
        	else
        	{
        		 usertxt.setText("");
                 passwrd.setText("");
                 this.pb.setValue(pb.getMinimum());
                 pb.setVisible(false);
        	}
        }
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                if(e.getSource()==Login)
                {              	
                    u=usertxt.getText();
                	ch=passwrd.getPassword();
                	p=new String(ch);
                	Login.setEnabled(false);
                	i=0;
                	timer.start();
                	sql="select * from Users where Username=? && Password=?";
                	st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                	st.setString(1,u);
                	st.setString(2,p);
                	rs=st.executeQuery();
                	rs.last();
                		if(rs.getRow()==0)
                		{
                			msg="Invalid Username or Password";	
                			b=false;                			
                		}
                			else
                			{
                				msg="Login succesFull";
                				b=true;
                			}
                }
            }
            catch(Exception error)
            {
               JOptionPane.showMessageDialog(this,error);
            }
        }
        public static void main(String []args)
        {
         new LoginSystem().show();
        }
}
class Home extends JFrame
{
	Container c;
	String name;
	JLabel lblmessage;
	JPanel p1;
	Home(String name)
	{
		this.name=name;
		c=getContentPane();
		setTitle("Home");
		setSize(500,500);
		lblmessage=new  JLabel("Welcome "+name);
		lblmessage.setBounds(100,100,150,40);
		p1=new JPanel();
		setLayout(null);
		p1.add(lblmessage);
		c.add(p1);
		addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
            System.exit(0);
            }
            });
	}
}
