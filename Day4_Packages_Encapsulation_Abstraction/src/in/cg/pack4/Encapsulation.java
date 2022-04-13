package in.cg.pack4;

import in.cg.pack3.SBI;

public class Encapsulation {


	
	public static void main(String[] args) {
		
		SBI s=new SBI();
		s.setBalance(30000);
		System.out.println("Your A/C Balance:"+s.getBalance());
	}
}