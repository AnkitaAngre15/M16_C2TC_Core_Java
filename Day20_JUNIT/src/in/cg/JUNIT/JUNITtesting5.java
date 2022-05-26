package in.cg.JUNIT;

import org.junit.jupiter.api.Assumptions;

public class JUNITtesting5 {
	
	void accept() {
		
		System.setProperty("1","Ankita");
		Assumptions.assumeFalse("Ankita".equals(System.getProperty("1")));
		
	}

}
