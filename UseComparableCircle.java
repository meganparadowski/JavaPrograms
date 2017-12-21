package removeDuplicates;

import java.util.Scanner;
public class UseComparableCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		
		ComparableCircle myCircle = new ComparableCircle(kb.nextInt());
		
		System.out.println(myCircle.toString());
		
		//create a new cirlce to compare to the above circle 
		ComparableCircle b = new ComparableCircle(8);
		
		System.out.println(myCircle.compareTo(b));
	}

}

