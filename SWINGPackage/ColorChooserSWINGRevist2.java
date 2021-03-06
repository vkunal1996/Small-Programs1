import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ColorChooserSWINGRevisit2 extends JFrame implements ActionListener
{
	JRadioButton red,blue,green,yellow,cyan;
	ButtonGroup grp;
	JPanel SampleColor;
	JLabel SampleText;
	JButton Reset;
	Container ct;
	private static String color;

	ColorChooserSWINGRevisit2()
	{
		ct=getContentPane();
		grp=new ButtonGroup();
		red=new JRadioButton("Red");
		blue=new JRadioButton("Blue");
		green=new JRadioButton("Green");
		yellow=new JRadioButton("Yellow");
		cyan=new JRadioButton("Cyan");
		red.setBounds(20,50,60,20);
		blue.setBounds(90,50,60,20);
		green.setBounds(160,50,80,20);
		yellow.setBounds(250,50,80,20);
		cyan.setBounds(340,50,100,20);
		grp.add(red);
		grp.add(blue);
		grp.add(green);
		grp.add(yellow);
		grp.add(cyan);
		ct.add(red);
		ct.add(blue);
		ct.add(green);
		ct.add(yellow);
		ct.add(cyan);

		SampleColor=new JPanel();
		SampleColor.setBounds(140,100,120,120);
		SampleColor.setBackground(Color.WHITE);
		ct.add(SampleColor);
		
		SampleText=new JLabel("white");
		SampleText.setBounds(175,230,50,30);
		ct.add(SampleText);

		Reset=new JButton("RESET COLOR");
		Reset.setBounds(120,280,150,30);
		ct.add(Reset);

		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		yellow.addActionListener(this);
		cyan.addActionListener(this);

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
	
	
	public void actionPerformed(ActionEvent e)
	{
			if(e.getSource()==red)
			{
				SampleColor.setBackground(Color.RED);
				SampleText.setText(red.getLabel());
				color="red";
			}
				else if(e.getSource()==blue)
				{
					SampleColor.setBackground(Color.BLUE);
					SampleText.setText(blue.getLabel());
					color="blue";
				}
					else if(e.getSource()==green)
					{
						SampleColor.setBackground(Color.GREEN);
						SampleText.setText(green.getLabel());
						color="green";
					}
						else if(e.getSource()==yellow)
						{
							SampleColor.setBackground(Color.YELLOW);
							SampleText.setText(yellow.getLabel());
							color="yellow";
						}
							else if(e.getSource()==cyan)
							{
								SampleColor.setBackground(Color.CYAN);
								SampleText.setText(cyan.getLabel());
								color="cyan";
							}

								if(e.getSource()==Reset)
								{
									switch(color)
									{
										case "red":
										ct.setBackground(Color.RED);
										break;
										case "blue":
										ct.setBackground(Color.BLUE);
										break;
										case "green":
										ct.setBackground(Color.GREEN);
										break;
										case "yellow":
										ct.setBackground(Color.YELLOW);
										break;
										case "cyan":
										ct.setBackground(Color.CYAN);
										break;
									}
								}
	}
	public static void main(String []args)
	{
		new ColorChooserSWINGRevisit2().show();
	}
}