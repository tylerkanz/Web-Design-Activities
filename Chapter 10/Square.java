/*Jason and Tyler
 *Chapter 10 Assignment 14
 *11/17/2019
 *Square Class
*/


public class Square extends TwoDimensionalShape
{
	private double length;
	
	public Square()
	{
		setLength(0.0);
	}
	
	public Square(double l)
	{
		setLength(l);
	}
	
	public void setLength(double l)
	{
		length = l;
	}
	
	public double getLength()
	{
		return length;
	}
	
	@Override
	//uses math to get the area of the square
	public double calculateArea() 
	{
		return Math.pow(getLength(), 2); 
	}
	
	@Override
	public String toString()
	{
		return String.format("%sLength: %.2f\n",super.toString(),getLength());
	}
}