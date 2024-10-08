package week02.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)

class Square_jUnit {

	static final double EPSILON = 1e-10;

	final Point pA = new Point(0, 0);
	final Point pB = new Point(6, 0);
	final Point pC = new Point(9, 4);
	final Point pD = new Point(3, 4);
	final Point pE = new Point(6, 4);
	final Point pF = new Point(0, 4);

	@Test
	void circumference_ABEF() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		Square sABEF = new Square(pA, pB);
		double expected = 24;
		double actual = sABEF.circumference();
		/**/System.out.println(actual);
		assertEquals(expected, actual, EPSILON);
	}

	@Test
	void area_ABEF() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		Square sABEF = new Square(pA, pB);
		double expected = 36;
		double actual = sABEF.area();
		/**/System.out.println(actual);
		assertEquals(expected, actual, EPSILON);
	}

	@Test
	void boundingBox_ABEF() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		Square sABEF = new Square(pA, pB);
		Rectangle expected = new Square(pA, pB);
		Rectangle actual = sABEF.boundingBox();
		/**/System.out.println(actual);
		assertEquals(expected, actual);
	}

}
