package removeDuplicates;

public class ComparableCircle extends GeometricObject implements Comparable<ComparableCircle>{
		
	private double radius;
	
	//no arg constructor
	
	public ComparableCircle()
	{
		
	}
	//arg constructor, takes double argument
	public ComparableCircle(double radius)
	{
		this.radius = radius;
	}
	
	//getter
	
	public double getRadius()
	{
		return radius;
	}
	
	//setter
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	//method to calculate area
	
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
	
	//method to calculate perimeter
	
	public double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}
	
	//override to string method from Object
	
	@Override
	public String toString()
	{
		return super.toString() + "\nradius is " + radius;
	}
	
	//override equal method from Object
	
	@Override
	public int compareTo(ComparableCircle c)
	{
		if (this.getRadius() > c.getRadius())
			return 1;
		else if (this.getRadius() < c.getRadius())
			return -1;
		else
			return 0;
	}
	
}

