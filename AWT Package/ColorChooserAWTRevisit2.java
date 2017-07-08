import java.awt.*;
import java.awt.event.*;
class ColorChooserAWTRevisit2 extends Frame implements ItemListener,ActionListener
{
	Checkbox red,blue,green,yellow,cyan;
	CheckboxGroup grp;
	Panel SampleColor;
	Label SampleText;
	Button Reset;
	private static String color;

	ColorChooserAWTRevisit2()
	{
		grp=new CheckboxGroup();
		red=new Checkbox("Red",grp,false);
		blue=new Checkbox("Blue",grp,false);
		green=new Checkbox("Green",grp,false);
		yellow=new Checkbox("Yellow",grp,false);
		cyan=new Checkbox("Cyan",grp,false);
		red.setBounds(20,50,60,20);
		blue.setBounds(90,50,60,20);
		green.setBounds(160,50,60,20);
		yellow.setBounds(230,50,60,20);
		cyan.setBounds(300,50,60,20);
		add(red);
		add(blue);
		add(green);
		add(yellow);
		add(cyan);

		SampleColor=new Panel();
		SampleColor.setBounds(140,100,120,120);
		SampleColor.setBackground(Color.WHITE);
		add(SampleColor);
		
		SampleText=new Label("white");
		SampleText.setBounds(175,230,50,30);
		add(SampleText);

		Reset=new Button("RESET COLOR");
		Reset.setBounds(120,280,150,30);
		add(Reset);

		red.addItemListener(this);
		blue.addItemListener(this);
		green.addItemListener(this);
		yellow.addItemListener(this);
		cyan.addItemListener(this);

		Reset.addActionListener(this);

		setTitle("ColorChooser..");
		setSize(400,350);
		setLayout(null);
		setResizable(false);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(1);
			}
		});

	}
	public void itemStateChanged(ItemEvent e)
	{
			if(red.getState()==true)
			{
				SampleColor.setBackground(Color.RED);
				SampleText.setText(red.getLabel());
				color="red";
			}
				else if(blue.getState()==true)
				{
					SampleColor.setBackground(Color.BLUE);
					SampleText.setText(blue.getLabel());
					color="blue";
				}
					else if(green.getState()==true)
					{
						SampleColor.setBackground(Color.GREEN);
						SampleText.setText(green.getLabel());
						color="green";
					}
						else if(yellow.getState()==true)
						{
							SampleColor.setBackground(Color.YELLOW);
							SampleText.setText(yellow.getLabel());
							color="yellow";
						}
							else if(cyan.getState()==true)
							{
								SampleColor.setBackground(Color.CYAN);
								SampleText.setText(cyan.getLabel());
								color="cyan";
							}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==Reset)
		{
			switch(color)
			{
				case "red":
				setBackground(Color.RED);
				break;
				case "blue":
				setBackground(Color.BLUE);
				break;
				case "green":
				setBackground(Color.GREEN);
				break;
				case "yellow":
				setBackground(Color.YELLOW);
				break;
				case "cyan":
				setBackground(Color.CYAN);
				break;
			}
		}
	}
	public static void main(String []args)
	{
		new ColorChooserAWTRevisit2().show();
	}
}