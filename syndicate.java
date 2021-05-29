package qsp;

public class syndicate implements Rbi2 {

	public void withdrawl()
	{
		System.out.println("im overridding withdrawl in syndicate");
	}
	public void deposite()
	{
		System.out.println("im overidding  depositing in sydicate");
	}
	public void loans()
	{
		System.out.println("im overidding loans in syndicate");
	}
	
	public static void main(String args[])
	{
		syndicate s=new syndicate();
		s.deposite();
		s.withdrawl();
		s.loans();
	}
}
