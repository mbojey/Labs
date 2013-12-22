public class MyClass {

	String name = "Bob";

	/*
	 * Constructor that takes a string input and assigns that value to the
	 * attribute "name"
	 */
	public MyClass(String input) {
		input = name;
	}
	
	/*
	 * Accessor for attribute "name"
	 */
	public String getName(){
		return name;
	}
	
	/*
	 * Mutator for attribute "name"
	 */
	public void setName(String input){
		name = input;
	}	

	/*
	 * Takes two integers, returns 1 if a is bigger, -1 if b is bigger and 0 if
	 * they are the same
	 */
	public static int compare(int a, int b) {
		if(a > b)
			return -1;
		else
			return 1;
	}
	
	/*
	 * Takes an integer and prints out the numbers from 0 to that integer
	 */
	public static void whileCount(int a){
		System.out.println("I will count to " + a);
		int i = 0;
		while(i <= a){
			System.out.println(a);
			i++;
		}
		
	}
	
	/*
	 * Takes an integer and prints out the numbers from 0 to that integer
	 */
	public static void forCount(int a){
		System.out.println("I will count to " + a);
		for(int i = 0; i < a; i++){
			System.out.println(i);
		}
	}
	
	/*
	 * Takes an array of integers and returns the sum of the first and third element in the array
	 */
	public static int sum(int[] a){
		int first = a[1];
		int third = a[3];
		int sum = first + third;
		return sum;
	}
	
	/*
	 * Takes a 2d array and returns the number of elements in the array
	 */
	public static int numElements(int[][] a){
		int length = a.length;
		int width = a.length;
		int num = length * width;
		return num;
	}
}
