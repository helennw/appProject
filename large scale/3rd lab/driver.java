


public class driver {
		IntegerArrayList array1;
		IntegerArrayList array2;
	public static void main(String[] args) {
		IntegerArrayList array1 = new IntegerArrayList();
		IntegerArrayList array2 = new IntegerArrayList(10); 
		array1.add(4);
		array1.add(77);
		array2.add(0,20);
		array2.add(2,7);
		array2.add(1,3);
		int value = array1.get(0);
		System.out.println("Value of the 0th Element is: " + value);
		int removed = array1.remove(2);
		System.out.println("We just removed the number: " + removed);
		if(array2.isEmpty()) {
			System.out.println(" 2nd array empty");
		}
		int number = 5;
		System.out.println( number +" has an index of " + array2.indexOf(number));
		//System.out.println(Arrays.asList(array2));
	}
}
