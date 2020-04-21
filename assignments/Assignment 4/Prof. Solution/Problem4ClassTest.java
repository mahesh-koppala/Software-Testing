package Homework4;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {

	Problem4Class prb4;
	
	@Before
	public void setUp() throws Exception {
		prb4 = new Problem4Class();
	}

	@FileParameters("src/Homework4/Problem4TestCaseTable.csv")
	@Test
	public void test (int testCaseNo, boolean goldStatus, double cart, int creditRating, int yearsMember, boolean expApproved, String bPath) {
		assertEquals(expApproved,prb4.checkOut(cart,creditRating,yearsMember,goldStatus));
	}
}