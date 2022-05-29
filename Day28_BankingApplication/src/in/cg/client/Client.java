package in.cg.client;




import in.cg.application.MMBankFactory;
import in.cg.application.MMCurrentAcc;
import in.cg.application.MMSavingAcc;
import in.cg.framework.BankFactory;
import in.cg.framework.CurrentAcc;
import in.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) 
	{
		 BankFactory s=new MMBankFactory();
		Object obj=s.getNewSavingAcc(101, "Ankita", 30000, false);
		 System.out.println(obj);
		// SavingAcc n=new MMSavingAcc(102, "Prema", 25000f, true);
		// CurrentAcc c1= new MMCurrentAcc(103,"Vignesh", 15000, 20000);
		// System.out.println("Saving Account");
		// n.withdraw(1000);
	//	 System.out.println("Current Account");
		// c1.withdraw(2000);c1.getAccBal();
		 System.out.println(s.getNewSavingAcc(104, "Anoop", 15000, false));
		System.out.println(s.getNewCurrentAcc(104, "Anurag", 20000, 23000f));
		// System.out.println(n);
		// System.out.println(c1);
		
		
	}

}


