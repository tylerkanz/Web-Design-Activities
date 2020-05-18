/*Jason and Tyler
 *Chapter 10 Assignment 14
 *11/17/2019
 *Cube Class
*/

public class Cube extends ThreeDimensionalShape
{
	private double edge;
	
	public Cube()
	{
		setEdge(0.0);
	}
	
	public Cube(double e)
	{
		setEdge(e);
	}
	
	public void setEdge(double e)
	{
		edge = e;
	}
	
	public double getEdge()
	{
		return edge;
	}
	
	//calculates the area
	public double calculateArea()
	{
		return 6 * Math.pow(getEdge(), 2);
	}
	
	//calculates the volume of the cube
	public double calculateVolume()
	{
		return  Math.pow(getEdge(), 3);
	}
	
	@Override
	public String toString()
	{
		return String.format("%sEdge: %.2f\n",super.toString(),getEdge());
	}
}