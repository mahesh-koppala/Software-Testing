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
public class Problem3ClassTest

{

	private Problem3Class class3;
	
	@Before
	public void setUp () {
		class3=new Problem3Class();
	}
	
	@Test
	@FileParameters("src/Problem3TestCaseTable.csv")	
public void test(int testcaseNumber, boolean member, int credit_rating, double cart, boolean approved, String bpNumber,String dummy) {		
		boolean a=class3.approvePurchase(member, credit_rating, cart);
		assertEquals(approved,a);
		
	}
}
