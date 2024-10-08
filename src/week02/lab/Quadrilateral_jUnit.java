package week02.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)

class Quadrilateral_jUnit {
	
	static final double EPSILON = 1e-10;

	final Point pA = new Point(0, 0);
	final Point pB = new Point(6, 0);
	final Point pC = new Point(9, 4);
	final Point pD = new Point(3, 4);
	final Point pE = new Point(6, 4);
	final Point pF = new Point(0, 4);

	@Test
	void circumference_ABCD() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		Quadrilateral qABCD = new Quadrilateral(pA, pB, pC, pD);
		double expected = 22;
		double actual = qABCD.circumference();
		/**/System.out.println(actual);
		assertEquals(expected, actual, EPSILON);
	}

	@Test
	void area_ABCD() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		Quadrilateral qABCD = new Quadrilateral(pA, pB, pC, pD);
		double expected = 24;
		double actual = qABCD.area();
		/**/System.out.println(actual);
		assertEquals(expected, actual, EPSILON);
	}

	@Test
	void boundingBox_ABCD() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		Quadrilateral qABCD = new Quadrilateral(pA, pB, pC, pD);
		Rectangle expected = new Rectangle(pA, pC);
		Rectangle actual = qABCD.boundingBox();
		/**/System.out.println(actual);
		assertEquals(expected, actual);
	}

}
