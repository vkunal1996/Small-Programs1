/*
	1.)Press P for paying cars
	2) N for Non Paying
	3.)C for Collection
	4.)Exit
*/
import java.util.Scanner;
class Cars
{
	private static char choice;
	private static int countp,countn,total;
	/*Cars()
	{
		countp=0;
		countn=0;
	}*/
	Cars(char choice)
	{
		this.choice=choice;
	}

	public static void check()
	{
		if(choice=='P')
		{
			countp++;
		}
			else if(choice=='N')
			{
				countn++;
			}
				else if(choice=='C')
				{
					System.out.println("Total number of Paying Cars : "+countp);
					System.out.println("Total number of Non Paying Cars : "+countn);
					System.out.println("Total Collection of the Day : "+countp*100);
					System.out.println("Total Loss due to Non Paying Cars : "+countn*100);
					if(countp*100==countn*100)
					{
						System.out.println("Neither Profit Nor Loss");
					}
						else if(countp*100>countn*100)
						{
							System.out.println("Still in Profit !!");
						}
							else
							{
								System.out.println("It is a Loss");
							}
				}
					else if(choice=='E')
					{
						System.exit(0);
					}
	}
	public static void clearScreen() 
	{  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
   	}  
	
}
	class Toll
	{
		public static void main(String []args)
		{
				//Cars c=new Cars();
				//c.clearScreen();
				char choice;
				Scanner input=new Scanner(System.in);
				do
				{
				System.out.println("1.) Press P for Paying Cars");
				System.out.println("2.) Press N for Non Paying Cars");
				System.out.println("2.) Press C to Get Today's Collection");
				System.out.println("4.) Press E to Exit");

					choice=input.next().charAt(0);
					new Cars(choice);
					//clearScreen();
					Cars.check();
				}while(true);
		}
	}