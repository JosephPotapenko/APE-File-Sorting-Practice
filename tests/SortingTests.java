import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.Arrays;

public class SortingTests {


	@Test
	public void testSortArrayEmptyArray() {
		try{
			String [] array = new String[0];
			
			Sorting.sortArray(array);
			assertEquals(0, array.length);
			assertEquals("[]", Arrays.toString(array));
			//System.out.println(Arrays.toString(array));
		}
		catch(Exception e){
			fail("Exception occurred in testSortArrayEmptyArray: " + e.getMessage());
		}
	}
	
	@Test
	public void testSortArrayOneItemArray() {
		try{
			String [] array = new String[1];
			
			array[0] = "apple";
			
			Sorting.sortArray(array);
			assertEquals(1, array.length);
			assertEquals("[apple]", Arrays.toString(array));
			//System.out.println(Arrays.toString(array));
		}
		catch(Exception e){
			fail("Exception occurred in testSortArrayOneItemArray: " + e.getMessage());
		}
	}
	
	@Test
	public void testSortArrayTwoItemsSortedArray() {
		try{
			String [] array = new String[2];
			
			array[0] = "apple";
			array[1] = "banana";
			
			Sorting.sortArray(array);
			assertEquals(2, array.length);
			assertEquals("[apple, banana]", Arrays.toString(array));
			//System.out.println(Arrays.toString(array));
		}
		catch(Exception e){
			fail("Exception occurred in testSortArrayTwoItemsSortedArray: " + e.getMessage());
		}
	}

	@Test
	public void testSortArrayThreeItemsSortedArray() {
		try{
			String [] array = new String[3];
			
			array[0] = "apple";
			array[1] = "banana";
			array[2] = "cherry";
			
			Sorting.sortArray(array);
			assertEquals(3, array.length);
			assertEquals("[apple, banana, cherry]", Arrays.toString(array));
			//System.out.println(Arrays.toString(array));
		}
		catch(Exception e){
			fail("Exception occurred in testSortArrayThreeItemsSortedArray: " + e.getMessage());
		}
	}
	
	@Test
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
			assertEquals(6, array.length);
			assertEquals("[apple, banana, cherry, dandelion, eggplant, fern]", Arrays.toString(array));
			//System.out.println(Arrays.toString(array));
		}
		catch(Exception e){
			fail("Exception occurred in testSortArraySixItemsSortedArray: " + e.getMessage());
		}
	}
	
	@Test
	public void testSortArrayTwoItemsNotSortedArray() {
		try{
			String [] array = new String[2];
			
			array[1] = "apple";
			array[0] = "banana";
			
			Sorting.sortArray(array);
			assertEquals(2, array.length);
			assertEquals("[apple, banana]", Arrays.toString(array));
			//System.out.println(Arrays.toString(array));
		}
		catch(Exception e){
			fail("Exception occurred in testSortArrayTwoItemsNotSortedArray: " + e.getMessage());
		}
	}
	
	@Test
	public void testSortArrayThreeItemsNotSortedArray() {
		try{
			String [] array = new String[3];
			
			array[1] = "apple";
			array[2] = "banana";
			array[0] = "cherry";
			
			Sorting.sortArray(array);
			assertEquals(3, array.length);
			assertEquals("[apple, banana, cherry]", Arrays.toString(array));
			//System.out.println(Arrays.toString(array));
		}
		catch(Exception e){
			fail("Exception occurred in testSortArrayThreeItemsNotSortedArray: " + e.getMessage());
		}
	}
	
	@Test
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
			assertEquals(6, array.length);
			assertEquals("[apple, banana, cherry, dandelion, eggplant, fern]", Arrays.toString(array));
			//System.out.println(Arrays.toString(array));
		}
		catch(Exception e){
			fail("Exception occurred in testSortArraySixItemsNotSortedArray1: " + e.getMessage());
		}
	}
	
	@Test
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
			assertEquals(6, array.length);
			assertEquals("[apple, banana, cherry, dandelion, eggplant, fern]", Arrays.toString(array));
			//System.out.println(Arrays.toString(array));
		}
		catch(Exception e){
			fail("Exception occurred in testSortArraySixItemsNotSortedArray2: " + e.getMessage());
		}
	}


}
