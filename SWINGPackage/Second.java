import java.awt.*;
import java.awt.event.*;
class Second extends Frame implements ItemListener
{
	Label lblMessage;
	Checkbox male,female;
	CheckboxGroup grp;
	Second()
	{
	setSize(300,300);
	setLayout(new FlowLayout());
	grp=new CheckboxGroup();
	male=new Checkbox("Male",grp,false);
	female=new Checkbox("Female",grp,true);
	add(male);add(female);
	lblMessage=new Label("                                 ");
	add(lblMessage);
	male.addItemListener(this);
	female.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(male.getState()==true)
		lblMessage.setText(male.getLabel());
		else if(female.getState()==true)
		lblMessage.setText(female.getLabel());
	}
	public static void main(String []ar)
	{
		new Second().show();
	}
}