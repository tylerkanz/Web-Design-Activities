/*Jason and Tyler
 *Chapter 10 Assignment 14
 *11/17/2019
 *ShapeTest Class
*/


public class ShapeTest 
{
	public static void main(String[] args)
	{
		//Array of shapes
		Shape[] shapes = new Shape[6];
		
		shapes[0] = new Square(6.0);
		shapes[1] = new Triangle(4.0, 5.0);
		shapes[2] = new Circle(7.0);
		shapes[3] = new Sphere(2.0);
		shapes[4] = new Cube(3.0);
		shapes[5] = new Tetrahedron(1.0);
		
		for(Shape s : shapes)
		{
			//Display for Two DimensionalShapes
			if(s instanceof TwoDimensionalShape)
					System.out.printf("%sArea: %.2f\n\n", s.toString(),((TwoDimensionalShape) s).calculateArea() );
				
			//Display for three Dimensional shapes
			else if(s instanceof ThreeDimensionalShape)
				System.out.printf("%sSurface Area: %.2f\nVolume: %.2f\n\n", s.toString(),
						((ThreeDimensionalShape) s).calculateArea(), 
						((ThreeDimensionalShape) s).calculateVolume());
		}
	}

}