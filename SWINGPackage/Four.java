import java.awt.*;
import java.awt.event.*;
class Four extends Frame implements ItemListener
{
	Label lblMessage,lblMessage1;
	Checkbox gym,play,male,female;
		CheckboxGroup grp;

	Panel checkBox,radioBox;
	Four()
	{
	setSize(500,200);
	setLayout(new FlowLayout(FlowLayout.CENTER));

	/*Check Boxes*/
	gym=new Checkbox("Gym");
	play=new Checkbox("Playground");
	lblMessage=new Label("                                   ");

	/*Radioboxes*/
	grp=new CheckboxGroup();
	male=new Checkbox("Male",grp,false);
	female=new Checkbox("Female",grp,true);
	lblMessage1=new Label("                                   ");



	/*Checbox Addition*/
	checkBox=new Panel();
	checkBox.setLayout(new GridLayout(1,3,10,10));
	checkBox.add(gym);checkBox.add(play);
	checkBox.add(lblMessage);

	add(checkBox);

	/*Radio buttons*/
	radioBox=new Panel();
	radioBox.setLayout(new GridLayout(1,3,10,10));
	radioBox.add(male);radioBox.add(female);radioBox.add(lblMessage1);
	add(radioBox);

	gym.addItemListener(this);
	play.addItemListener(this);
	male.addItemListener(this);
	female.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(gym.getState()==true && play.getState()==true)
		lblMessage.setText(gym.getLabel()+"  "+play.getLabel());
		else if(gym.getState()==true)
		lblMessage.setText(gym.getLabel());
		else if(play.getState()==true)
		lblMessage.setText(play.getLabel());


		if(male.getState()==true)
		lblMessage1.setText(male.getLabel());
		else if(female.getState()==true)
		lblMessage1.setText(female.getLabel());

	}
	public static void main(String []ar)
	{
		new Four().show();
	}
}