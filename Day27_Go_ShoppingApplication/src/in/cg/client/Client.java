package in.cg.client;




import in.cg.application.GSNormalAcc;
import in.cg.application.GSPrimeAcc;
import in.cg.application.GSShopFactory;
import in.cg.framework.NormalAcc;
import in.cg.framework.PrimeAcc;
import in.cg.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(101,"Ankita",550,true);
		NormalAcc n=new GSNormalAcc(102,"Netrangi",500,10);
		System.out.println("Prime account ");
		p.bookProduct(p.getCharge());
		System.out.println("Normal account");
		n.bookProduct(n.getCharges());
		//System.out.println(s.getNewPrimeAcc(103, "Hritik", 1236, true));
		//System.out.println(s.getNewNormalAcc(104, "Anoop", 1000, 50));
		
		System.out.println(p);
		System.out.println(n);
		}

	}
