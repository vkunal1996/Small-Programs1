import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class First extends JFrame implements FocusListener
{
	JLabel lblFirst,lblSecond,lblResult;
	JTextField txtFirst,txtSecond,txtResult;
	JButton btnSum,btnMul;
	JPanel pnlBase;
	Container ct;
	First()
	{
	ct=getContentPane();
	ct.setBackground(Color.yellow);
	setSize(300,300);
	//setLayout(new FlowLayout(FlowLayout.LEFT));
	setLayout(new BorderLayout());
		lblFirst=new JLabel("First Number:");
		txtFirst=new JTextField(10);		
		lblSecond=new JLabel("Second Number:");
		txtSecond=new JTextField(10);		
		lblResult=new JLabel("Result Number:");
		txtResult=new JTextField(10);		
		btnSum=new JButton("Sum");
		btnMul=new JButton("Mulplication");
		pnlBase=new JPanel();
		pnlBase.setBackground(Color.cyan);
		pnlBase.setLayout(new GridLayout(4,2,10,10));
		pnlBase.add(lblFirst);pnlBase.add(txtFirst);
		pnlBase.add(lblSecond);pnlBase.add(txtSecond);
		pnlBase.add(lblResult);pnlBase.add(txtResult);
		pnlBase.add(btnSum);pnlBase.add(btnMul);
		ct.add(pnlBase,BorderLayout.NORTH);	
		setResizable(false);	
		//txtSecond.addFocusListener(this);
		txtResult.addFocusListener(this);
	}
	public void focusLost(FocusEvent e)
	{
		
	}
	public void focusGained(FocusEvent e)
	{
		int a,b;
		a=Integer.parseInt(txtFirst.getText());
		b=Integer.parseInt(txtSecond.getText());
		txtResult.setText(String.valueOf(a+b));
	}
	public static void main(String []ar)
	{
		new First().show();
	}
}