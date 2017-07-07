import java.awt.*;
import java.awt.event.*;
class ColorChooserAWT extends Frame implements ItemListener,ActionListener
{
	Checkbox red,blue,green,yellow,cyan;
	CheckboxGroup grp;
	Panel SampleColor;
	Label SampleText;
	Button Reset;
	private static String color;

	ColorChooserAWT()
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
			}
				else if(blue.getState()==true)
				{
					SampleColor.setBackground(Color.BLUE);
					SampleText.setText(blue.getLabel());
				}
					else if(green.getState()==true)
					{
						SampleColor.setBackground(Color.GREEN);
						SampleText.setText(green.getLabel());
					}
						else if(yellow.getState()==true)
						{
							SampleColor.setBackground(Color.YELLOW);
							SampleText.setText(yellow.getLabel());
						}
							else if(cyan.getState()==true)
							{
								SampleColor.setBackground(Color.CYAN);
								SampleText.setText(cyan.getLabel());
							}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==Reset)
		{
			SampleColor.setBackground(Color.WHITE);
			SampleText.setText("white");
		}
	}
	public static void main(String []args)
	{
		new ColorChooserAWT().show();
	}
}