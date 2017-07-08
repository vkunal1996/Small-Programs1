import java.awt.*;
import java.awt.event.*;
class StudentInfo extends Frame implements ActionListener,ItemListener
{
	Label Name,Fname,Mname,RollNumber,Sex,MaritalStatus,Facilities;
	Button Show;
	Checkbox Male,Female,Single,Married,Gym,Playground,Pool,Internet;
	CheckboxGroup grp1,grp2;
	TextField name,fname,mname,rollnumber;

	Label 	DName,DFname,DMname,DRollNumber,DSex,DMaritalStatus,DFacilities;
	Label dname,dfname,dmname,drollnumber;
	Label dsex,dfacilities,dmaritalstatus;

	StudentInfo()
	{
		setTitle("Student Information");
		setSize(450,600);
		setResizable(false);
		setLayout(null);
		setBackground(Color.PINK);
		setForeground(Color.BLUE);
		Name=new Label("Student Name ");
		Fname=new Label("Father Name ");va
		Mname=new Label("Mother Name ");
		RollNumber=new Label("Roll Number");
		Sex=new Label("Sex ");
		MaritalStatus=new Label("Marital Status");
		Facilities=new Label("Facilities ");

		DName=new Label("                             ");
		DFname=new Label("                           ");
		DMname=new Label("                           ");
		DRollNumber=new Label("                                ");
		DSex=new Label("             ");
		DFacilities=new Label("                                                            ");
		DMaritalStatus=new Label("                        ");

		dname=new Label("                          ");
		dfname=new Label("                           ");
		dmname=new Label("                           ");
		drollnumber=new Label("                          ");
		dsex=new Label("            ");
		dfacilities=new Label("                                       ");
		dmaritalstatus=new Label("           ");

		name=new TextField(20);
		name.setBackground(Color.GREEN);
		fname=new TextField(20);
		fname.setBackground(Color.GREEN);
		mname=new TextField(20);
		mname.setBackground(Color.GREEN);
		rollnumber=new TextField(20);
		rollnumber.setBackground(Color.GREEN);

		grp1=new CheckboxGroup();
		Male=new Checkbox("Male",grp1,false);
		Female=new Checkbox("Female",grp1,false);

		grp2=new CheckboxGroup();
		Single=new Checkbox("Single",grp2,false);
		Married=new Checkbox("Married",grp2,false);

		Gym=new Checkbox("Gym");
		Playground=new Checkbox("Playground");
		Pool=new Checkbox("Pool");
		Internet=new Checkbox("Internet");

		Show=new Button("Show Details");

		Name.setBounds(60,50,100,20);
		add(Name);
		name.setBounds(170,50,140,20);
		add(name);
		RollNumber.setBounds(60,70,100,20);
		add(RollNumber);
		rollnumber.setBounds(170,70,140,20);
		add(rollnumber);
		Fname.setBounds(60,90,100,20);
		add(Fname);
		fname.setBounds(170,90,140,20);
		add(fname);
		Mname.setBounds(60,110,100,20);
		add(Mname);
		mname.setBounds(170,110,140,20);
		add(mname);
		
		Sex.setBounds(60,140,100,20);
		add(Sex);
		Male.setBounds(170,140,60,20);
		add(Male);
		Female.setBounds(240,140,60,20);
		add(Female);


		MaritalStatus.setBounds(60,170,100,20);
		add(MaritalStatus);
		Single.setBounds(170,170,60,20);
		add(Single);
		Married.setBounds(240,170,70,20);
		add(Married);

		Facilities.setBounds(60,200,100,20);
		add(Facilities);
		Gym.setBounds(170,200,60,20);
		add(Gym);
		Playground.setBounds(240,200,100,20);
		add(Playground);
		Pool.setBounds(170,230,60,20);
		add(Pool);
		Internet.setBounds(240,230,100,20);
		add(Internet);

		Show.setBounds(150,270,120,40);
		Show.setBackground(Color.GREEN);
		add(Show);


		DName.setBounds(60,350,120,40);
		add(DName);
		dname.setBounds(180,350,120,40);
		add(dname);

		DFname.setBounds(60,380,120,40);
		add(DFname);
		dfname.setBounds(180,380,120,40);
		add(dfname);

		DRollNumber.setBounds(60,410,120,40);
		add(DRollNumber);
		drollnumber.setBounds(180,410,120,40);
		add(drollnumber);

		DMname.setBounds(60,440,120,40);
		add(DMname);
		dmname.setBounds(180,440,120,40);
		add(dmname);

		DSex.setBounds(60,480,120,40);
		add(DSex);
		dsex.setBounds(180,480,120,40);
		add(dsex);

		DMaritalStatus.setBounds(60,510,120,40);
		add(DMaritalStatus);
		dmaritalstatus.setBounds(180,510,120,40);
		add(dmaritalstatus);

		DFacilities.setBounds(60,540,120,40);
		add(DFacilities);
		dfacilities.setBounds(180,540,200,40);
		add(dfacilities);


		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit (1);
				}
			});
		Show.addActionListener(this);
		Male.addItemListener(this);
		Female.addItemListener(this);
		Single.addItemListener(this);
		Married.addItemListener(this);
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
				if(Male.getState()==true)
				{
					dsex.setText(Male.getLabel());
				}
					else if(Female.getState()==true)
					{
						dsex.setText(Female.getLabel());
					}
					DMaritalStatus.setText("MariTal Status");
					if(Single.getState()==true)
					{
						dmaritalstatus.setText(Single.getLabel());
					}
						else if(Married.getState()==true)
						{
							dmaritalstatus.setText(Married.getLabel());
						}
						DFacilities.setText("Facilties");
						if(Gym.getState()==true&&Playground.getState()==true&&Pool.getState()==true&&Internet.getState()==true)
						{
							dfacilities.setText(Gym.getLabel()+" "+Playground.getLabel()+" "+Pool.getLabel()+" "+Internet.getLabel());
						}
							else if(Gym.getState()==true&&Playground.getState()==true&&Pool.getState()==true)
							{
								dfacilities.setText(Gym.getLabel()+" "+Playground.getLabel()+" "+Pool.getLabel());
							}
								else if(Gym.getState()==true&&Playground.getState()==true&&Internet.getState()==true)
								{
								dfacilities.setText(Gym.getLabel()+" "+Playground.getLabel()+" "+Internet.getLabel());
								}
									else if(Gym.getState()==true&&Internet.getState()==true&&Pool.getState()==true)
									{
										dfacilities.setText(Gym.getLabel()+" "+Internet.getLabel()+" "+Pool.getLabel());
									}
										else if(Internet.getState()==true&&Playground.getState()==true&&Pool.getState()==true)
										{
											dfacilities.setText(Internet.getLabel()+" "+Playground.getLabel()+" "+Pool.getLabel());
										}
											else if(Gym.getState()==true&&Internet.getState()==true)
											{
												dfacilities.setText(Gym.getLabel()+" "+Internet.getLabel());
											}
												else if(Gym.getState()==true&&Playground.getState()==true)
												{
												dfacilities.setText(Gym.getLabel()+" "+Playground.getLabel());
												}
													else if(Gym.getState()==true&&Pool.getState()==true)
													{
														dfacilities.setText(Gym.getLabel()+" "+Pool.getLabel());
													}
														else if(Pool.getState()==true&&Playground.getState()==true)
														{
															dfacilities.setText(Pool.getLabel()+" "+Playground.getLabel());
														}
															else if(Pool.getState()==true&&Internet.getState()==true)
															{
															dfacilities.setText(Pool.getLabel()+" "+Internet.getLabel());
															}
																else if(Internet.getState()==true&&Playground.getState()==true)
																{
																	dfacilities.setText(Internet.getLabel()+" "+Playground.getLabel());
																}
																	else if(Gym.getState()==true)
																	{
																		dfacilities.setText(Gym.getLabel());
																	}
																		else if(Pool.getState()==true)
																		{
																		dfacilities.setText(Pool.getLabel());
																		}
																			else if(Playground.getState()==true)
																			{
																				dfacilities.setText(Playground.getLabel());
																			}
																				else if(Internet.getState()==true)
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
		new StudentInfo().show();
	}
}