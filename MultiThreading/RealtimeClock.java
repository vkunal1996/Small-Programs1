import java.awt.*;
import java.util.*;
import javax.swing.*;
	class First extends JFrame  implements Runnable
	{
		JLabel lblH,lblM,lblS;
		JTextField txtH,txtM,txtS;
		JPanel pnlBase;
		Thread t;
		Container c;
		First()
		{
		c=getContentPane();
		setSize(500,500);
		setLayout(new FlowLayout());
		pnlBase=new JPanel();
		pnlBase.setLayout(new GridLayout(1,6,10,10));
		lblH=new JLabel("HH");
		txtH=new JTextField(2);
		pnlBase.add(lblH);pnlBase.add(txtH);	

		lblM=new JLabel("MM");
		txtM=new JTextField(2);
		pnlBase.add(lblM);pnlBase.add(txtM);	

		lblS=new JLabel("SS");
		txtS=new JTextField(2);
		pnlBase.add(lblS);pnlBase.add(txtS);	
		add(pnlBase,BorderLayout.NORTH);
		t=new Thread(this);
		t.start();
		}
			public void run()
			{
				try
				{
		Date d=new Date();
		txtH.setText(String.valueOf(d.getHours()));
		txtM.setText(String.valueOf(d.getMinutes()));
		txtS.setText(String.valueOf(d.getSeconds()));
		Thread tt=new Thread(this);
		tt.start();
				}
				catch(Exception e)
				{
			JOptionPane.showMessageDialog(this,e);
				}
			}
		public static void main(String []ar)
		{
			new First().show();
		}
	}