package in.cg.string;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		StringBuilder sb=new StringBuilder(sc.nextLine());
		System.out.println(sb.capacity());//16
		sc.close();

	}

}
	

	



