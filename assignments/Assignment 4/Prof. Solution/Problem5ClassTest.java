package Homework4;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {

	Problem5Class prb5;
	
	@Before
	public void setUp() throws Exception {
		prb5 = new Problem5Class();
	}

	@FileParameters("src/Homework4/Problem5TestCaseTable.csv")
	@Test
	public void test (int testCaseNo, double x, double expY, String bPath) {
		assertEquals(expY,prb5.calcY(x),0.001);
	}
}