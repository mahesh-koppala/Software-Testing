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
public class Problem5ClassTest

{

	private Problem5Class class5;
	
	@Before
	public void setUp () {
		class5=new Problem5Class();
	}
	
	@Test
	@FileParameters("src/Problem5TestCaseTable.csv")	
	public void test(int testcaseNumber, double var_x, double var_y,String bpNumber) {		
		double a=class5.calcY(var_x);
		assertEquals(var_y,a,0.01);
		
	}
}

