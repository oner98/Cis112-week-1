package week02.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)

class CodeToBeTested_jUnit {

	private static final boolean DEBUG = true;
	
	static final double EPSILON = 1e-10;

	@Test
	void area_0() {
		if (DEBUG) {
			System.out
					.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		int radius = 0;
		CodeToBeTested codeToBeTested = new CodeToBeTested(radius);
		double expected = 0;
		double actual = codeToBeTested.area();
		assertEquals(expected, actual, EPSILON);
	}

	@Test
	void curcumference_0() {
		if (DEBUG) {
			System.out
					.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		int radius = 0;
		CodeToBeTested codeToBeTested = new CodeToBeTested(radius);
		double expected = 0;
		double actual = codeToBeTested.circumference();
		assertEquals(expected, actual, EPSILON);
	}

	@Test
	void area_mine() {
		if (DEBUG) {
			System.out
					.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	@Test
	void curcumference_mine() {
		if (DEBUG) {
			System.out
					.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
