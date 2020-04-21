package homework4;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {

	private Problem1Class ob1;
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem1ClassTest () {
		return $(
//				
//				Test case 1
				$(0.00,-50.00,false,false),
//				Test case 2
				$(1499.99,1514.99,false,false),
//				Test case 3
				$(5000.00,5055.00,false,false),
//				Test case 4
				$(9999.99,10124.99,false,false),
//				Test case 5
				$(25000.00,25375.00,false,false),
//				Test case 6
				$(49999.99,50999.99,false,false),
//				Test case 7
				$(50000.00,51250.00,true,true),
//				Test case 8
				$(-20000.00,-20050.00,false,false),
//				Test case 9
				$(0.01,0.01,false,false),
//				Test case 10
				$(1500.00,1516.50,false,false),
//				Test case 11
				$(5000.01,5062.51,false,false),
//				Test case 12
				$(10000.00,10150.00,false,false),
//				Test case 13
				$(25000.01,25500.01,false,false),
//				Test case 14
				$(100000.00,102500.00,true,true)
				
		);
	}

	@Before
	public void setUp () {
		ob1 = new Problem1Class();
	}
	
	@Test
	@Parameters(method="parametersForProblem1ClassTest")
	public void test(double balance,double ans_balance,boolean giftcard,boolean status) {
		
		ob1.calculateBalance(balance);
		assertEquals(ans_balance,ob1.getBalance(),0.01);
		assertEquals(giftcard,ob1.isGiftCard());
		assertEquals(status,ob1.isHonoredStatus());
	}

}

