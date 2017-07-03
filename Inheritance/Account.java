package hdfc;
public abstract class Account
{
	public int Bank_id;
	public String BankName;
    public String Location;
	public long ContactNumber;

	public abstract void collectBankInfo();
}