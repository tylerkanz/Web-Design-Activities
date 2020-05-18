/*Jason and Tyler
 *Chapter 10 Assignment 14
 *11/17/2019
 *Tetrahedron Class
*/

public class Tetrahedron extends ThreeDimensionalShape
{
	private double edge;
	
	public Tetrahedron()
	{
		setEdge(0.0);
	}
	
	public Tetrahedron(double e)
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
	
	//calls java math to find square root
	public double calculateArea()
	{
		return Math.sqrt(3) * Math.pow(getEdge(), 2);
	}
	
	//calculates the volume with math
	public double calculateVolume()
	{
		return  Math.pow(getEdge(), 3) / (6 * Math.sqrt(2));
	}
	
	//overrides
	@Override
	public String toString()
	{
		return String.format("%sEdge: %.2f\n",super.toString(),getEdge());
	}
	

}