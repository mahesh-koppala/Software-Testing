package Homework4;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem2ClassTest {

	Problem2Class prb2;
	
	@Before
	public void setUp() throws Exception {
		prb2 = new Problem2Class();
	}

	@FileParameters("src/Homework4/Problem2TestCaseTable.csv")
	@Test
	public void test (int testCaseNo, boolean cruiseEngaged, double distance, int timer, boolean expRedLight, boolean expYellowLight, 
			boolean expGreenLight, int expTimer, String bPath) {
		prb2.setTimer(timer);
		prb2.setWarnings(cruiseEngaged,distance);
		assertEquals(expRedLight,prb2.isRedLight());
		assertEquals(expYellowLight,prb2.isYellowLight());
		assertEquals(expGreenLight,prb2.isGreenLight());
		assertEquals(expTimer,prb2.getTimer());
	}
}