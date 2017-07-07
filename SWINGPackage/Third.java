import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Third extends JFrame implements ActionListener,ItemListener
{
	JLabel lblMessage,lblMessage1;
	JRadioButton male,female;
	ButtonGroup grp;

	JCheckBox gym,play;
	Panel p1,p2;
	Container ct;
	Third()
	{
	ct=getContentPane();
	setSize(400,600);
	ct.setLayout(new FlowLayout(FlowLayout.CENTER));
	
	lblMessage=new JLabel("                                 ");
	lblMessage1=new JLabel("                                 ");
	
	male=new JRadioButton("Male");
	female=new JRadioButton("Female");
	grp=new ButtonGroup();
	grp.add(male);grp.add(female);
	
	gym=new JCheckBox("Gym");
	play=new JCheckBox("play");
	
	p1=new Panel();
	//p1.setBackground(Color.YELLOW);
	p1.setLayout(new GridLayout(1,3,10,10));
	p1.add(male);p1.add(female);p1.add(lblMessage);
	ct.add(p1);

	p2=new Panel();
	//p2.setBackground(Color.cyan);
	p2.setLayout(new GridLayout(1,3,10,10));
	p2.add(gym);p2.add(play);p2.add(lblMessage1);
	ct.add(p2);

	

	male.addActionListener(this);
	female.addActionListener(this);
	gym.addItemListener(this);
	play.addItemListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==male)
		lblMessage.setText(male.getLabel());	
		else if(e.getSource()==female)
		lblMessage.setText(female.getLabel());	
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(gym.isSelected()==true&&play.isSelected()==true)
		lblMessage1.setText(gym.getLabel()+"  "+play.getLabel());
		else if(gym.isSelected()==true)
		lblMessage1.setText(gym.getLabel());
		else if(play.isSelected()==true)
		lblMessage1.setText(play.getLabel());
	}
	public static void main(String []ar)
	{
		new Third().show();
	}
}