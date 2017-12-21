/*
 * Remove Duplicates: enter 10 integers separated by the enter key and the program will remove duplicate integers and display 
 * the results
 */

//import the classes we need
import java.util.ArrayList;
import java.util.Scanner;

public class remove {
	
	//define method
	public static void removeDuplicates(ArrayList<Integer> list)
	{	
		//loop through elements in arraylist
		for (int i = 0; i < list.size(); i++)
		{
			//loop through all other elements to see if there are any matches
			for (int j = 0; j < list.size(); j++)
			{
				//make sure we don't compare the element to itself
				if (j != i)
				{
					//if we find a match, remove it
					if (list.get(i) == list.get(j))
					{
						list.remove(j);
					}
				}
			}
		}
	}
	
	//test method in main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create new arraylist
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//declare scanner variable
		Scanner kb = new Scanner(System.in);
		
		//ask for 10 ints and add them to the arraylist
		System.out.println("Enter 10 integers: ");
		for (int i = 0; i < 10; i++)
		{
			list.add(kb.nextInt());
		}
		
		//pass list to the method created above
		removeDuplicates(list);
		
		//print each element separated by one space
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
		
	}

}
