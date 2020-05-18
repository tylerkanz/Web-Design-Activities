/*Jason and Tyler
 *Chapter 10 Assignment 14
 *11/17/2019
 *Sphere Class
*/

public class Sphere extends ThreeDimensionalShape
{
	private double radius;
	
	public Sphere()
	{
		setRadius(0.0);
	}
	
	public Sphere(double r)
	{
		setRadius(r);
	}
	
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	//uses java math to get the area from pi and radius
	public double calculateArea(){
		return ( 4 * Math.PI ) * (Math.pow(getRadius(), 2)); 
	}
	
	//calculates the volume in the same way
	public double calculateVolume(){
		double v = 4/3;
		return (1.3333 * Math.PI ) * (Math.pow(getRadius(),3));
	}
	
	
	@Override
	public String toString(){
		return String.format("%sRadius: %.2f\n",super.toString(),getRadius());
	}
}