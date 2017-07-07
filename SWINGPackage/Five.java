import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Five extends JFrame implements ItemListener
{
	JLabel lblMessage;
	JCheckBox gym,play;
	Container ct;
	Five()
	{
	ct=getContentPane();
	setSize(300,300);
	setLayout(new FlowLayout());
	gym=new JCheckBox("Gym");
	play=new JCheckBox("Playground");
	add(gym);add(play);
	gym.addItemListener(this);
	play.addItemListener(this);
	lblMessage=new JLabel("                                   ");
	add(lblMessage);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(gym.isSelected()==true && play.isSelected()==true)
		lblMessage.setText(gym.getLabel()+"  "+play.getLabel());
		else if(gym.isSelected()==true)
		lblMessage.setText(gym.getLabel());
		else if(play.isSelected()==true)
		lblMessage.setText(play.getLabel());

	}
	public static void main(String []ar)
	{
		new Five().show();
	}
}