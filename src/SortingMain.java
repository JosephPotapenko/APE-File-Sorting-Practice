/*
 * Non-JUnit tests for Sorting sortArray method
 * 
 * Compile and run this file against your solution to sortArray method in Sorting.java
 * 
 * Correct output shown in comment below main method
 * 
 * Testing methods follow comment that contains correct output. Check those methods
 * for expected results.
 * 
 */

/*
 * Non JUnit test file.  The main method below calls test methods that
 * examine the functionality of your solution.
 * 
 * Examine the output produced from running this file against a correct solution.
 * The output is shown as a comment below the main method.
 * 
 * Be sure and look at the code in the test methods to help guide how your
 * solution should perform.
 * 
 */

import java.util.Arrays;


public class SortingMain {

	public static void main(String[] args) {
		SortingMain tester = new SortingMain();
		
		tester.testSortArrayEmptyArray();
		tester.testSortArrayOneItemArray();
		tester.testSortArrayTwoItemsSortedArray();
		tester.testSortArrayThreeItemsSortedArray();
		tester.testSortArraySixItemsSortedArray();
		tester.testSortArrayTwoItemsNotSortedArray();
		tester.testSortArrayThreeItemsNotSortedArray();
		tester.testSortArraySixItemsNotSortedArray1();
		tester.testSortArraySixItemsNotSortedArray2();

	}
/*
Correct output shown below:

PASSED testSortArrayEmptyArray
PASSED testSortArrayOneItemArray
PASSED testSortArrayTwoItemsSortedArray
PASSED testSortArrayThreeItemsSortedArray
PASSED testSortArraySixItemsSortedArray
PASSED testSortArrayTwoItemsNotSortedArray
PASSED testSortArrayThreeItemsNotSortedArray
PASSED testSortArraySixItemsNotSortedArray1
PASSED testSortArraySixItemsNotSortedArray2

*/

	public void testSortArrayEmptyArray() {
		try{
			String [] array = new String[0];
			
			Sorting.sortArray(array);
			
			if (Arrays.toString(array).equals("[]"))
				System.out.println("PASSED testSortArrayEmptyArray");
			else
				System.out.println("FAILED testSortArrayEmptyArray");
			
		}
		catch(Exception e){
			System.out.println("FAILED -- Exception occurred in testSortArrayEmptyArray: " + e.getMessage());
		}
	}
	

	public void testSortArrayOneItemArray() {
		try{
			String [] array = new String[1];
			
			array[0] = "apple";
			
			Sorting.sortArray(array);
			
			if (Arrays.toString(array).equals("[apple]"))
				System.out.println("PASSED testSortArrayOneItemArray");
			else
				System.out.println("FAILED testSortArrayOneItemArray");

		
		}
		catch(Exception e){
			System.out.println("FAILED -- Exception occurred in testSortArrayOneItemArray: " + e.getMessage());
		}
	}
	

	public void testSortArrayTwoItemsSortedArray() {
		try{
			String [] array = new String[2];
			
			array[0] = "apple";
			array[1] = "banana";
			
			Sorting.sortArray(array);
			
			if (Arrays.toString(array).equals("[apple, banana]"))
				System.out.println("PASSED testSortArrayTwoItemsSortedArray");
			else
				System.out.println("FAILED testSortArrayTwoItemsSortedArray");

		
		}
		catch(Exception e){
			System.out.println("FAILED -- Exception occurred in testSortArrayTwoItemsSortedArray: " + e.getMessage());
		}
	}


	public void testSortArrayThreeItemsSortedArray() {
		try{
			String [] array = new String[3];
			
			array[0] = "apple";
			array[1] = "banana";
			array[2] = "cherry";
			
			Sorting.sortArray(array);
			
			if (Arrays.toString(array).equals("[apple, banana, cherry]"))
				System.out.println("PASSED testSortArrayThreeItemsSortedArray");
			else
				System.out.println("FAILED testSortArrayThreeItemsSortedArray");

	
		}
		catch(Exception e){
			System.out.println("FAILED -- Exception occurred in testSortArrayThreeItemsSortedArray: " + e.getMessage());
		}
	}
	

	public void testSortArraySixItemsSortedArray() {
		try{
			String [] array = new String[6];
			
			array[0] = "apple";
			array[1] = "banana";
			array[2] = "cherry";
			array[3] = "dandelion";
			array[4] = "eggplant";
			array[5] = "fern";
			
			Sorting.sortArray(array);
			
			
			if (Arrays.toString(array).equals("[apple, banana, cherry, dandelion, eggplant, fern]"))
				System.out.println("PASSED testSortArraySixItemsSortedArray");
			else
				System.out.println("FAILED testSortArraySixItemsSortedArray");

		}
		catch(Exception e){
			System.out.println("FAILED -- Exception occurred in testSortArraySixItemsSortedArray: " + e.getMessage());
		}
	}
	

	public void testSortArrayTwoItemsNotSortedArray() {
		try{
			String [] array = new String[2];
			
			array[1] = "apple";
			array[0] = "banana";
			
			Sorting.sortArray(array);
			
			if (Arrays.toString(array).equals("[apple, banana]"))
				System.out.println("PASSED testSortArrayTwoItemsNotSortedArray");
			else
				System.out.println("FAILED testSortArrayTwoItemsNotSortedArray");


		}
		catch(Exception e){
			System.out.println("FAILED -- Exception occurred in testSortArrayTwoItemsNotSortedArray: " + e.getMessage());
		}
	}
	

	public void testSortArrayThreeItemsNotSortedArray() {
		try{
			String [] array = new String[3];
			
			array[1] = "apple";
			array[2] = "banana";
			array[0] = "cherry";
			
			Sorting.sortArray(array);
			
			if (Arrays.toString(array).equals("[apple, banana, cherry]"))
				System.out.println("PASSED testSortArrayThreeItemsNotSortedArray");
			else
				System.out.println("FAILED testSortArrayThreeItemsNotSortedArray");
		
		}
		catch(Exception e){
			System.out.println("FAILED -- Exception occurred in testSortArrayThreeItemsNotSortedArray: " + e.getMessage());
		}
	}
	

	public void testSortArraySixItemsNotSortedArray1() {
		try{
			String [] array = new String[6];
			
			array[5] = "apple";
			array[4] = "banana";
			array[3] = "cherry";
			array[2] = "dandelion";
			array[0] = "eggplant";
			array[1] = "fern";
			
			Sorting.sortArray(array);
			
			if (Arrays.toString(array).equals("[apple, banana, cherry, dandelion, eggplant, fern]"))
				System.out.println("PASSED testSortArraySixItemsNotSortedArray1");
			else
				System.out.println("FAILED testSortArraySixItemsNotSortedArray1");
	
		
		}
		catch(Exception e){
			System.out.println("FAILED -- Exception occurred in testSortArraySixItemsNotSortedArray1: " + e.getMessage());
		}
	}
	

	public void testSortArraySixItemsNotSortedArray2() {
		try{
			String [] array = new String[6];
			
			array[3] = "apple";
			array[5] = "banana";
			array[4] = "cherry";
			array[2] = "dandelion";
			array[0] = "eggplant";
			array[1] = "fern";
			
			Sorting.sortArray(array);
			
			if (Arrays.toString(array).equals("[apple, banana, cherry, dandelion, eggplant, fern]"))
				System.out.println("PASSED testSortArraySixItemsNotSortedArray2");
			else
				System.out.println("FAILED testSortArraySixItemsNotSortedArray2");
	
	
		
		}
		catch(Exception e){
			System.out.println("FAILED -- Exception occurred in testSortArraySixItemsNotSortedArray2: " + e.getMessage());
		}
	}

	
}
