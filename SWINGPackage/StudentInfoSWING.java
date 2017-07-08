import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class StudentInfoSWING extends JFrame implements ActionListener,ItemListener
{
	JLabel Name,Fname,Mname,RollNumber,Sex,MaritalStatus,Facilities;
	JButton Show;
	JCheckBox Gym,Playground,Pool,Internet;
	JRadioButton Male,Female,Single,Married;
	ButtonGroup grp1,grp2;
	JTextField name,fname,mname,rollnumber;

	JLabel 	DName,DFname,DMname,DRollNumber,DSex,DMaritalStatus,DFacilities;
	JLabel dname,dfname,dmname,drollnumber;
	JLabel dsex,dfacilities,dmaritalstatus;

	Container ct;

	StudentInfoSWING()
	{
		ct=getContentPane();
		setTitle("Student Information");
		setSize(450,600);
		setResizable(false);
		setLayout(null);
		setBackground(Color.PINK);
		setForeground(Color.BLUE);
		Name=new JLabel("Student Name ");
		Fname=new JLabel("Father Name ");
		Mname=new JLabel("Mother Name ");
		RollNumber=new JLabel("Roll Number");
		Sex=new JLabel("Sex ");
		MaritalStatus=new JLabel("Marital Status");
		Facilities=new JLabel("Facilities ");

		DName=new JLabel("                             ");
		DFname=new JLabel("                           ");
		DMname=new JLabel("                           ");
		DRollNumber=new JLabel("                                ");
		DSex=new JLabel("             ");
		DFacilities=new JLabel("                                                            ");
		DMaritalStatus=new JLabel("                        ");

		dname=new JLabel("                          ");
		dfname=new JLabel("                           ");
		dmname=new JLabel("                           ");
		drollnumber=new JLabel("                          ");
		dsex=new JLabel("            ");
		dfacilities=new JLabel("                                       ");
		dmaritalstatus=new JLabel("           ");

		name=new JTextField(20);
		name.setBackground(Color.GREEN);
		fname=new JTextField(20);
		fname.setBackground(Color.GREEN);
		mname=new JTextField(20);
		mname.setBackground(Color.GREEN);
		rollnumber=new JTextField(20);
		rollnumber.setBackground(Color.GREEN);

		//grp1=new CheckboxGroup();
		grp1=new ButtonGroup();
		Male=new JRadioButton("Male");
		Female=new JRadioButton("Female");
		grp1.add(Male);grp1.add(Female);

		//grp2=new CheckboxGroup();
		grp2=new ButtonGroup();
		Single=new JRadioButton("Single");
		Married=new JRadioButton("Married");
		grp2.add(Single);
		grp2.add(Married);

		Gym=new JCheckBox("Gym");
		Playground=new JCheckBox("Playground");
		Pool=new JCheckBox("Pool");
		Internet=new JCheckBox("Internet");

		Show=new JButton("Show Details");

		Name.setBounds(60,50,100,20);
		ct.add(Name);
		name.setBounds(170,50,140,20);
		ct.add(name);
		RollNumber.setBounds(60,70,100,20);
		ct.add(RollNumber);
		rollnumber.setBounds(170,70,140,20);
		ct.add(rollnumber);
		Fname.setBounds(60,90,100,20);
		ct.add(Fname);
		fname.setBounds(170,90,140,20);
		ct.add(fname);
		Mname.setBounds(60,110,100,20);
		ct.add(Mname);
		mname.setBounds(170,110,140,20);
		ct.add(mname);
		
		Sex.setBounds(60,140,100,20);
		ct.add(Sex);
		Male.setBounds(170,140,60,20);
		ct.add(Male);
		Female.setBounds(240,140,60,20);
		ct.add(Female);


		MaritalStatus.setBounds(60,170,100,20);
		ct.add(MaritalStatus);
		Single.setBounds(170,170,60,20);
		ct.add(Single);
		Married.setBounds(240,170,70,20);
		ct.add(Married);

		Facilities.setBounds(60,200,100,20);
		ct.add(Facilities);
		Gym.setBounds(170,200,60,20);
		ct.add(Gym);
		Playground.setBounds(240,200,100,20);
		ct.add(Playground);
		Pool.setBounds(170,230,60,20);
		ct.add(Pool);
		Internet.setBounds(240,230,100,20);
		ct.add(Internet);

		Show.setBounds(150,270,120,40);
		Show.setBackground(Color.GREEN);
		ct.add(Show);


		DName.setBounds(60,350,120,40);
		ct.add(DName);
		dname.setBounds(180,350,120,40);
		ct.add(dname);

		DFname.setBounds(60,380,120,40);
		ct.add(DFname);
		dfname.setBounds(180,380,120,40);
		ct.add(dfname);

		DRollNumber.setBounds(60,410,120,40);
		ct.add(DRollNumber);
		drollnumber.setBounds(180,410,120,40);
		ct.add(drollnumber);

		DMname.setBounds(60,440,120,40);
		ct.add(DMname);
		dmname.setBounds(180,440,120,40);
		ct.add(dmname);

		DSex.setBounds(60,480,120,40);
		ct.add(DSex);
		dsex.setBounds(180,480,120,40);
		ct.add(dsex);

		DMaritalStatus.setBounds(60,510,120,40);
		ct.add(DMaritalStatus);
		dmaritalstatus.setBounds(180,510,120,40);
		ct.add(dmaritalstatus);

		DFacilities.setBounds(60,540,120,40);
		ct.add(DFacilities);
		dfacilities.setBounds(180,540,200,40);
		ct.add(dfacilities);


		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit (1);
				}
			});
		Show.addActionListener(this);
		Male.addActionListener(this);
		Female.addActionListener(this);
		Single.addActionListener(this);
		Married.addActionListener(this);
		Gym.addItemListener(this);
		Playground.addItemListener(this);
		Pool.addItemListener(this);
		Internet.addItemListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String sname,fathername,mothername,srollnumber;
		sname=name.getText();
		fathername=fname.getText();
		mothername=mname.getText();
		srollnumber=rollnumber.getText();
			if(e.getSource()==Show)
			{
				DName.setText("Student Name");
				dname.setText(sname);
				DFname.setText("Father Name ");
				dfname.setText(fathername);
				DMname.setText("Mother Name ");
				dmname.setText(mothername);
				DRollNumber.setText("Roll Number");
				drollnumber.setText(srollnumber);
				
				DSex.setText("Sex");
				if(Male.isSelected()==true)
				{
					dsex.setText(Male.getLabel());
				}
					else if(Female.isSelected()==true)
					{
						dsex.setText(Female.getLabel());
					}
					DMaritalStatus.setText("MariTal Status");
					if(Single.isSelected()==true)
					{
						dmaritalstatus.setText(Single.getLabel());
					}
						else if(Married.isSelected()==true)
						{
							dmaritalstatus.setText(Married.getLabel());
						}
						DFacilities.setText("Facilties");
						if(Gym.isSelected()==true&&Playground.isSelected()==true&&Pool.isSelected()==true&&Internet.isSelected()==true)
						{
							dfacilities.setText(Gym.getLabel()+" "+Playground.getLabel()+" "+Pool.getLabel()+" "+Internet.getLabel());
						}
							else if(Gym.isSelected()==true&&Playground.isSelected()==true&&Pool.isSelected()==true)
							{
								dfacilities.setText(Gym.getLabel()+" "+Playground.getLabel()+" "+Pool.getLabel());
							}
								else if(Gym.isSelected()==true&&Playground.isSelected()==true&&Internet.isSelected()==true)
								{
								dfacilities.setText(Gym.getLabel()+" "+Playground.getLabel()+" "+Internet.getLabel());
								}
									else if(Gym.isSelected()==true&&Internet.isSelected()==true&&Pool.isSelected()==true)
									{
										dfacilities.setText(Gym.getLabel()+" "+Internet.getLabel()+" "+Pool.getLabel());
									}
										else if(Internet.isSelected()==true&&Playground.isSelected()==true&&Pool.isSelected()==true)
										{
											dfacilities.setText(Internet.getLabel()+" "+Playground.getLabel()+" "+Pool.getLabel());
										}
											else if(Gym.isSelected()==true&&Internet.isSelected()==true)
											{
												dfacilities.setText(Gym.getLabel()+" "+Internet.getLabel());
											}
												else if(Gym.isSelected()==true&&Playground.isSelected()==true)
												{
												dfacilities.setText(Gym.getLabel()+" "+Playground.getLabel());
												}
													else if(Gym.isSelected()==true&&Pool.isSelected()==true)
													{
														dfacilities.setText(Gym.getLabel()+" "+Pool.getLabel());
													}
														else if(Pool.isSelected()==true&&Playground.isSelected()==true)
														{
															dfacilities.setText(Pool.getLabel()+" "+Playground.getLabel());
														}
															else if(Pool.isSelected()==true&&Internet.isSelected()==true)
															{
															dfacilities.setText(Pool.getLabel()+" "+Internet.getLabel());
															}
																else if(Internet.isSelected()==true&&Playground.isSelected()==true)
																{
																	dfacilities.setText(Internet.getLabel()+" "+Playground.getLabel());
																}
																	else if(Gym.isSelected()==true)
																	{
																		dfacilities.setText(Gym.getLabel());
																	}
																		else if(Pool.isSelected()==true)
																		{
																		dfacilities.setText(Pool.getLabel());
																		}
																			else if(Playground.isSelected()==true)
																			{
																				dfacilities.setText(Playground.getLabel());
																			}
																				else if(Internet.isSelected()==true)
																				{
																					dfacilities.setText(Internet.getLabel());
																				}



			}
	}
	public void itemStateChanged(ItemEvent e)
	{

	}
	public static void main(String []args)
	{
		new StudentInfoSWING().show();
	}
}