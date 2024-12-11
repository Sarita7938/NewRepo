package TestClass;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(SeleniumFremwork.ListnerTestClass.class)

public class test {
	@Test()
		public void test() {
		System.out.println("print test case");
		}
	
	

}
