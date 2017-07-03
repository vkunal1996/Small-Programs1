
import java.util.Scanner;
class FractionCalculation extends Exception
{
	private int nem1,den1,nem2,den2;
	private int nem,den,hcf;
	private char Opertator;
	public void getFirstFraction()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the First Num : ");
		nem1=input.nextInt();
		System.out.print("Enter the First Den : ");
		den1=input.nextInt();
		hcf=ReduceFraction(nem1,den1);
		nem1=nem1/hcf;
		den1=den1/hcf;
	}
	public void getSecondFraction()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the First Num : ");
		nem2=input.nextInt();
		System.out.print("Enter the First Den : ");
		den2=input.nextInt();
		hcf=ReduceFraction(nem2,den2);
		nem2=nem2/hcf;
		den2=den2/hcf;
	}
	public int ReduceFraction(int a,int b)
	{
		int d;
		
			if(a>b)
			{
				d=hcf(a,b);
			}
				else
				{
					d=hcf(b,a);
				}
				return d;
	}
	public void sumCalculation()
	{
		try
		{
		Opertator='+';
		nem=(nem1*den2)+(den1*nem2);
		den=den1*den2;
		if(nem==0)
		{
			nem=0;
			den=1;
		}
			else
			{
				hcf=ReduceFraction(nem,den);
				nem=nem/hcf;
				den=den/hcf;
			}
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
	}
	public void subCalculation()
	{
		try
		{
		Opertator='-';
		nem=(nem1*den2)-(den1*nem2);
		den=den1*den2;
		if(nem==0)
		{
			nem=0;
			den=1;
		}
			else
			{
				hcf=ReduceFraction(nem,den);
				nem=nem/hcf;
				den=den/hcf;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void mulCalculation()
	{
		try
		{
		Opertator='*';
		nem=nem1*nem2;
		den=den1*den2;
		if(nem==0)
		{
			nem=0;
			den=1;
		}
			else
			{
				hcf=ReduceFraction(nem,den);
				nem=nem/hcf;
				den=den/hcf;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
	public void divCalculation()
	{
		try
		{
		Opertator='/';
		nem=nem1*den2;
		den=den1*nem2;
		if(nem==0)
		{
			nem=0;
			den=1;
		}
			else
			{
				hcf=ReduceFraction(nem,den);
				nem=nem/hcf;
				den=den/hcf;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void Output()
	{
		if(nem==0)
		{

			System.out.println(nem1+"/"+den1+""+Opertator+""+nem2+"/"+den2+" = "+nem);
		}
			else if(nem==den)
			{
			System.out.println(nem1+"/"+den1+""+Opertator+""+nem2+"/"+den2+" = "+nem/den);
			}
			else
			{
			System.out.println(nem1+"/"+den1+""+Opertator+""+nem2+"/"+den2+" = "+nem+"/"+den);
			}
	}
	public int hcf(int x,int y)
	{
		int rem=1;
		while(rem!=0)
		{
			rem=x%y;
			x=y;
			y=rem;
		}
		return x;
	}
}
class Main
{
	public static void main(String []args)
	{
		FractionCalculation f=new FractionCalculation();
		Scanner input=new Scanner(System.in);
		char choice;
		
		do
		{
		System.out.println("1.) Sum 2.) Sub 3.) Mul 4.)Div 5.)Exit : Enter Choice : ");
		choice=input.next().charAt(0);
			switch(choice)
			{
				case '1':
				f.getFirstFraction();
				f.getSecondFraction();
				f.sumCalculation();
						f.Output();

				break;
				case '2':
				f.getFirstFraction();
				f.getSecondFraction();
				f.subCalculation();
						f.Output();

				break;
				case '3':
				f.getFirstFraction();
				f.getSecondFraction();
				f.mulCalculation();
						f.Output();

				break;
				case '4':
				f.getFirstFraction();
				f.getSecondFraction();
				f.divCalculation();
						f.Output();
				break;
			}


		}while(choice!='5');
	}
}
