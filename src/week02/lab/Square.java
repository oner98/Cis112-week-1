package week02.lab;

/**
 * Square, which is parallel to axes.
 * 
 * Point pA is the leftmost corner among the lowest corners. Points pA, pB, pC,
 * pD are ordered counterclockwise.
 * 
 * @author bingol
 */
public class Square extends Rectangle {

	public Square(Point pA, Point pB) {
		super(pA, new Point(pB.x, pA.distance(pB)));
	}

	@Override
	public double circumference() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
        double sideLength = pA.distance(pB);
        
        // Perimeter of the square
        return 4 * sideLength;
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

	// commented out
	@Override
	public double area() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		 System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
	        
	        // Calculate the side length from pA to pB
	        double sideLength = pA.distance(pB);
	        
	        // Area of the square
	        return sideLength * sideLength;
	    
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

}
