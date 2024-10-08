package week02.lab;

/**
 * Rectangle, which is parallel to axes. Subclass implementation of Rectangle,
 * where Quadrilateral is the parent.
 * 
 * Point pA is the leftmost corner among the lowest corners. Points pA, pB, pC,
 * pD are ordered counterclockwise.
 * 
 * @author bingol
 *
 */
public class Rectangle extends Quadrilateral {

	/**
	 * pA and pC are the corners of a diagonal.
	 * 
	 * @param pA
	 * @param pC
	 */
	public Rectangle(Point pA, Point pC) {
		super(pA, new Point(pC.x, pA.y), pC, new Point(pA.x, pC.y));
	}

	@Override
	public double circumference() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		 double width = pA.distance(new Point(pC.x, pA.y));
	        double height = pA.distance(new Point(pA.x, pC.y));

	        // Perimeter of the rectangle
	        return 2 * (width + height);
		
	}

	// commented out
	@Override
	public double area() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		 double width = pA.distance(new Point(pC.x, pA.y));
	        double height = pA.distance(new Point(pA.x, pC.y));

	        // Area of the rectangle
	        return width * height;
	    }
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	

	@Override
	public Rectangle boundingBox() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
         return this;
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
