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
public class Problem2ClassTest {

	private Problem2Class obj;
	
	@Before
	public void setUp () {
		obj = new Problem2Class();
	}
	
	@Test
	@FileParameters("src/Problem2TestCaseTable.csv")	
	public void test(int testcaseNumber, boolean cruiseEngaged,double Distance, int timer, boolean RedLight,boolean YellowLight, boolean GreenLight,int timer_result,String bpNumber) {		
		obj.setTimer(timer);
		obj.setWarnings(cruiseEngaged, Distance);
		assertEquals(YellowLight,obj.isYellowLight());
		assertEquals(RedLight,obj.isRedLight());
		assertEquals(GreenLight,obj.isGreenLight());
		assertEquals(timer_result,obj.getTimer());
	}
}	