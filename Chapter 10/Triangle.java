/*Jason and Tyler
 *Chapter 10 Assignment 14
 *11/17/2019
 *Triangle Class
*/

public class Triangle extends TwoDimensionalShape
{
	//variables
	private double base;
	private double height;
	
	//sets default
	public Triangle()
	{
		setBase(0.0);
		setHeight(0.0);
	}
	
	public Triangle(double b, double h)
	{
		setBase(b);
		setHeight(h);
	}
	
	public void setBase(double b)
	{
		base = b;
	}
	
	public void setHeight(double h)
	{
		height = h;
	}
	
	//gets the base dimensions
	public double getBase()
	{
		return base;
	}
	
	//gets the height
	public double getHeight()
	{
		return height;
	}

	//overrides
	@Override
	public double calculateArea() 
	{
		return (getBase() * getHeight()) / 2;
	}
	
	@Override
	public String toString()
	{
		//returns all the measurments
		return String.format("%sBase: %.2f\nHeight: %.2f\n",super.toString(),getBase(),getHeight());
	}
	
	

	
}