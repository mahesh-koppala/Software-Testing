package Homework4;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {

	Problem3Class prb3;
	
	@Before
	public void setUp() throws Exception {
		prb3 = new Problem3Class();
	}

	@FileParameters("src/Homework4/Problem3TestCaseTable.csv")
	@Test
	public void test (int testCaseNo, boolean member, int creditRating, double cart, boolean expApproved, 
						String bPath, String MCDC) {
		assertEquals(expApproved,prb3.approvePurchase(member,creditRating,cart));
	}
}