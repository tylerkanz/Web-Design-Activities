/*Jason and Tyler
 *Chapter 10 Assignment 14
 *11/17/2019
 *Two Dimensional shape Class
*/

public abstract class TwoDimensionalShape extends Shape
{
	private double area;
	
	//gets and returns the area for the two dimensional shape
	public double getArea() {
		return area;
	}

	public abstract double calculateArea();
	
	
}