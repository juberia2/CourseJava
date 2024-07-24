import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Parameterizedtestdemo {
	@ParameterizedTest
	@ValueSource(strings= {"cali","bali","dali"})

	void endswithI(String str) {
		assertTrue(str.endsWith("i"));
	}
}
