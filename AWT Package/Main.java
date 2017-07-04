import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
class Main extends Frame implements ActionListener
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
	

	Button Calculate;



	Main()
	{
		setSize(350,530);
		setTitle("Student's Report Card ..");
		FlowLayout fl=new FlowLayout();
		setLayout(fl);
		setBackground(Color.yellow);
		setForeground(Color.blue);

		LStudentName=new Label("Student Name         ");
		TStudentName=new TextField(20);
		LRollNumber=new Label("Roll Number           ");
		TRollNumber=new TextField(20);
		LFatherName=new Label("Father Name          ");
		TFatherName=new TextField(20);
		LMothernName=new Label("Mother Name         ");
		TMothernName=new TextField(20);
		Subject=new Label("Subject    ");
		Internal=new Label("Internal(25)");
		External=new Label("External(75)");
		Total=new Label("Total ");
		LC=new Label("C++           ");
		TIC=new TextField(7);
		TEC=new TextField(7);
		TRC=new TextField(7);
		LJava=new Label("Java           ");
		TIJava=new TextField(7);
		TEJava=new TextField(7);
		TRJava=new TextField(7);
		LPHP=new Label("PHP           ");
		TIPHP=new TextField(7);
		TEPHP=new TextField(7);
		TRPHP=new TextField(7);
		LLinux=new Label("Linux         ");
		TILinux=new TextField(7);
		TELinux=new TextField(7);
		TRLinux=new TextField(7);
		LHTML=new Label("HTML          ");
		TIHTML=new TextField(7);
		TEHTML=new TextField(7);
		TRHTML=new TextField(7);
		TotalMarks=new Label("Total Marks     ");
		TTotalMarks=new TextField(20);
		Percentage=new Label("Percentage     ");
		TPercentage=new TextField(20);
		Grade=new Label("     Grade          ");
		TGrade=new TextField(20);
		Calculate=new Button("Calculate");

		add(LStudentName);add(TStudentName);
		add(LRollNumber);add(TRollNumber);
		add(LFatherName);add(TFatherName);
		add(LMothernName);add(TMothernName);
		add(Subject);add(Internal);add(External);add(Total);
		add(LC);add(TIC);add(TEC);add(TRC);
		add(LJava);add(TIJava);add(TEJava);add(TRJava);
		add(LPHP);add(TIPHP);add(TEPHP);add(TRPHP);
		add(LLinux);add(TILinux);add(TELinux);add(TRLinux);
		add(LHTML);add(TIHTML);add(TEHTML);add(TRHTML);
		add(TotalMarks);add(TTotalMarks);
		add(Percentage);add(TPercentage);
		add(Grade);add(TGrade);
		add(Calculate);

		Calculate.addActionListener(this);
		TRC.setEditable(false);
		TRJava.setEditable(false);
		TRPHP.setEditable(false);
		TRLinux.setEditable(false);
		TRHTML.setEditable(false);
		TTotalMarks.setEditable(false);
		TPercentage.setEditable(false);
		TGrade.setEditable(false);

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
	}
	public static void main(String []args)
	{
		Main m=new Main();
		m.show();
	}
}
