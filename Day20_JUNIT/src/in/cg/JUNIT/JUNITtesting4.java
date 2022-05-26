package in.cg.JUNIT;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class JUNITtesting4 {
	
	 @Test
		@AfterAll
		@BeforeAll
		static void display() 
		{
			System.out.println("Ankita");
			
		} 
   
    
    @Tag("Technoserve")
    @Test
    @Disabled
    
    void display1() {
    	
    	System.out.println("Prema");
    }
  
    
}
