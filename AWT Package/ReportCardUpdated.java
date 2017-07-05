import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
class ReportCardUpdated extends Frame implements ActionListener
{
	
	Label LStudentName,LFatherName,LMothernName,LRollNumber;
	
	TextField TStudentName,TFatherName,TMothernName,TRollNumber;
		
	Label Subject,Internal,External,Total;
	
	Label LC,LJava,LPHP,LLinux,LHTML;
	
	TextField TIC,TIJava,TIPHP,TILinux,TIHTML;

	TextField TEC,TEJava,TEPHP,TELinux,TEHTML;

	TextField TRC,TRJava,TRPHP,TRLinux,TRHTML;

	Label TotalMarks,Percentage,Grade;

	TextField TTotalMarks,TPercentage,TGrade;
	

	Button Calculate,Clear;

	Panel P1,P2,P3,P4;



	ReportCardUpdated()
	{
		setSize(400,700);
		setTitle("Student's Report Card ..");
			setLayout(new FlowLayout(FlowLayout.CENTER));

		setBackground(Color.yellow);
		setForeground(Color.blue);

		
		LStudentName=new Label("Student Name");
		TStudentName=new TextField(20);
		LRollNumber=new Label("Roll Number");
		TRollNumber=new TextField(10);
		LFatherName=new Label("Father Name");
		TFatherName=new TextField(20);
		LMothernName=new Label("Mother Name");
		TMothernName=new TextField(20);
		Subject=new Label("Subject    ");
		Internal=new Label("Internal(25)");
		External=new Label("External(75)");
		Total=new Label("     Total ");
		LC=new Label("C++");
		TIC=new TextField(4);
		TEC=new TextField(4);
		TRC=new TextField(4);
		LJava=new Label("Java");
		TIJava=new TextField(4);
		TEJava=new TextField(4);
		TRJava=new TextField(4);
		LPHP=new Label("PHP");
		TIPHP=new TextField(4);
		TEPHP=new TextField(4);
		TRPHP=new TextField(4);
		LLinux=new Label("Linux");
		TILinux=new TextField(4);
		TELinux=new TextField(4);
		TRLinux=new TextField(4);
		LHTML=new Label("HTML          ");
		TIHTML=new TextField(4);
		TEHTML=new TextField(4);
		TRHTML=new TextField(4);
		TotalMarks=new Label("Total Marks");
		TTotalMarks=new TextField(4);
		Percentage=new Label("Percentage");
		TPercentage=new TextField(4);
		Grade=new Label("Grade");
		TGrade=new TextField(1);
		Calculate=new Button("Calculate");
		Clear=new Button("Clear");
		P1=new Panel();
		P2=new Panel();
		P3=new Panel();
		

				P1.setLayout(new GridLayout(4,2,10,10));

		P1.add(LStudentName);P1.add(TStudentName);
		P1.add(LRollNumber);P1.add(TRollNumber);
		P1.add(LFatherName);P1.add(TFatherName);
		P1.add(LMothernName);P1.add(TMothernName);
		add(P1);

		

				P2.setLayout(new GridLayout(7,4,10,10));
		P2.add(Subject);P2.add(Internal);P2.add(External);P2.add(Total);
		P2.add(LC);P2.add(TIC);P2.add(TEC);P2.add(TRC);
		P2.add(LJava);P2.add(TIJava);P2.add(TEJava);P2.add(TRJava);
		P2.add(LPHP);P2.add(TIPHP);P2.add(TEPHP);P2.add(TRPHP);
		P2.add(LLinux);P2.add(TILinux);P2.add(TELinux);P2.add(TRLinux);
		P2.add(LHTML);P2.add(TIHTML);P2.add(TEHTML);P2.add(TRHTML);
		TRC.setEditable(false);
		TRJava.setEditable(false);
		TRPHP.setEditable(false);
		TRLinux.setEditable(false);
		TRHTML.setEditable(false);
				add(P2);

		
		
				P3.setLayout(new GridLayout(4,2,10,10));
		P3.add(TotalMarks);P3.add(TTotalMarks);
		P3.add(Percentage);P3.add(TPercentage);
		P3.add(Grade);P3.add(TGrade);
		TTotalMarks.setEditable(false);
		TPercentage.setEditable(false);
		TGrade.setEditable(false);
		P3.add(Calculate);P3.add(Clear);
		add(P3);

				

					


		Calculate.addActionListener(this);
		Clear.addActionListener(this);
		
		
		
		setResizable(false);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
			System.exit(0);
			}
		});

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==Calculate)
		{
			String name,fname,mname;
			long rollno;
			float mi1,mi2,mi3,mi4,mi5,me1,me2,me3,me4,me5;
			float t1,t2,t3,t4,t5,total,per;
			char grade;
			name=TStudentName.getText();
			fname=TFatherName.getText();
			mname=TMothernName.getText();
			rollno=Long.parseLong(TRollNumber.getText());
			mi1=Float.parseFloat(TIC.getText());
			me1=Float.parseFloat(TEC.getText());
			
			mi2=Float.parseFloat(TIJava.getText());
			me2=Float.parseFloat(TEJava.getText());
			
			mi3=Float.parseFloat(TIPHP.getText());
			me3=Float.parseFloat(TEPHP.getText());
			
			mi4=Float.parseFloat(TILinux.getText());
			me4=Float.parseFloat(TELinux.getText());
			
			mi5=Float.parseFloat(TIHTML.getText());
			me5=Float.parseFloat(TEHTML.getText());

			t1=mi1+me1;t2=mi2+me2;t3=mi3+me3;t4=mi4+me4;t5=mi5+me5;
			total=t1+t2+t3+t4+t5;
			per=total/5;
				if(per>=70)
				{
					grade='A';
				}
					else if(per>=60)
					{
						grade='B';
					}
						else
						{
							grade='C';
						}

			TRC.setText(String.valueOf(t1));
			TRJava.setText(String.valueOf(t2));
			TRPHP.setText(String.valueOf(t3));
			TRLinux.setText(String.valueOf(t4));
			TRHTML.setText(String.valueOf(t5));
			TTotalMarks.setText(String.valueOf(total));
			TPercentage.setText(String.valueOf(per));
			TGrade.setText(""+grade);


		}
			else if(e.getSource()==Clear)
			{
			TStudentName.setText("");
			TFatherName.setText("");
			TMothernName.setText("");
			TRollNumber.setText("");
			TIC.setText("");
			TEC.setText("");
			
			TIJava.setText("");
			TEJava.setText("");
			
			TIPHP.setText("");
			TEPHP.setText("");
			
			TILinux.setText("");
			TELinux.setText("");
			
			TIHTML.setText("");
			TEHTML.setText("");

			TRC.setText("");
			TRJava.setText("");
			TRPHP.setText("");
			TRLinux.setText("");
			TRHTML.setText("");
			TTotalMarks.setText("");
			TPercentage.setText("");
			TGrade.setText("");
			}
	}
	public static void main(String []args)
	{
		ReportCardUpdated m=new ReportCardUpdated();
		m.show();
	}
}
