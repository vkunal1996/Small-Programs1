import hdfc.Customer;
import hdfc.Account;
import hdfc.Calling;
class My
{
	public static void main(String []args)
	{
		Customer C;
		Account A;
		Calling cal=new Calling();
		C=(Calling)cal;
		A=(Calling)cal;
		System.out.println("Enter the Bank Details : ");
		A.collectBankInfo();
		System.out.println("Enter the Customer Details : ");
		C.Customerinfo();
		cal.Output();
	}
}