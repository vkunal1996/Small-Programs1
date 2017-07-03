package hdfc;
import java.util.Scanner;

		public class Calling extends Account implements Customer
		{
			String Customername,Wittness,Address;
			long MinBalance,CustomerId;
			public void Customerinfo()
			{
				Scanner input=new Scanner(System.in);
				System.out.println("Enter the Customer Name : ");
				Customername=input.nextLine();
				System.out.println("Enter the Wittness Name : ");
				Wittness=input.nextLine();
				System.out.println("Enter the Address : ");
				Address=input.nextLine();
				System.out.println("Enter the Customer Id : ");
				CustomerId=input.nextLong();
				System.out.println("Enter the Minimum Balance : ");
				MinBalance=input.nextLong();
			}	
			public void collectBankInfo()
			{
				Scanner input=new Scanner(System.in);
				System.out.println("Enter the Bank_id : ");
				Bank_id=input.nextInt();
				input.nextLine();
			    System.out.println("Enter the Bank Name : ");
			    BankName=input.nextLine();
			    System.out.println("Enter the Location : ");
			    Location=input.nextLine();
			    System.out.println("Enter the Bank's Contact Number : ");
			    ContactNumber=input.nextLong();
			}

			public void Output()
			{
				System.out.println("Entered Bank Details Are : ");
				System.out.println("Bank Id : "+Bank_id);
				System.out.println("Bank Name : "+BankName);
				System.out.println("Bank Location : "+Location);
				System.out.println("Bank Contact: "+ContactNumber);

				System.out.println("Entered Customer Details are : ");
				System.out.println("Customer Name : "+Customername);
				System.out.println("Wittness Name : "+Wittness);
				System.out.println("Customer Address : "+Address);
				System.out.println("Customer Id : "+CustomerId);
				System.out.println("Customer Balance : "+MinBalance);

			}

}
	
