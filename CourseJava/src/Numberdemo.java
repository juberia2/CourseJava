import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Numberdemo {
	@Test
	void factorialtest() {
		int exp=80;
		int act=Numberfun.getFactorial(5);
		assertEquals(exp, act);
	}
}
