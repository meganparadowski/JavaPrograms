package removeDuplicates;

import java.util.Scanner;
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{

	private int sideLength;
	
	//no arg constructor
	
	public Octagon()
	{
		
	}
	
	//arg constructor, takes a side length
	
	public Octagon(int sideLength)
	{
		this.sideLength = sideLength;
	}
	
	//setter
	
	public void setSideLength(int sideLength)
	{
		this.sideLength = sideLength;
	}
	
	//getter
	
	public int getSideLength()
	{
		return sideLength;
	}
	
	//method to calculate area
	
	public double getArea()
	{
		return 2 * (1 + Math.sqrt(2)) * Math.pow(sideLength, 2);
	}
	
	//method to calculate perimeter
	
	public double getPerimeter()
	{
		return sideLength * 8;
	}
	
	//override equal method from Object, implement comparable interface
	
	@Override
	public int compareTo(Octagon c)
	{
		if (this.getArea() > c.getArea())
			return 1;
		else if (this.getArea() < c.getArea())
			return -1;
		else
			return 0;
	}
	
	//override clone method from Object, implement cloneable interface
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	//override toString from Object
	
	@Override
	public String toString()
	{
		return super.toString() + "\narea is " + this.getArea();
	}
	
	//test octagon class
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the side length of the octagon:");
		int length = kb.nextInt();

		Octagon myOctagon = new Octagon(length);
		
		System.out.println("Area: " + myOctagon.getArea());
		
		System.out.println("Perimeter: " + myOctagon.getPerimeter());

		Object myClone = myOctagon.clone();
		
		//compare the clone to the actual octagon (we should get zero because they should be exactly the same)
		System.out.println(((Octagon)myClone).compareTo(myOctagon));
	}

}