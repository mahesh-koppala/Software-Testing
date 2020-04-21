package homework4;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest

{

	private Problem4Class class4;
	
	@Before
	public void setUp () {
		class4=new Problem4Class();
	}
	
	@Test
	@FileParameters("src/Problem4TestCaseTable.csv")	
	public void test(int testcaseNumber, boolean gold_status, double cart, int credit_rating, int years,boolean approved, String bpNumber) {		
		boolean a=class4.checkOut(cart, credit_rating, years, gold_status);
		assertEquals(approved,a);
		
	}
}
