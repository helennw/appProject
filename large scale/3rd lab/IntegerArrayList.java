

/**
 * Integer Array List Class 
 * @author Hannah M. Clark 
 */
public class IntegerArrayList {
	
	int[] arrayList;
	int index;
	int removedNum;
	IntegerArrayList() {
		arrayList = new int[8];
		index = 0;
	}
	/**
	 * makes IntegerArrayList size user enters
	 */
	IntegerArrayList(int size) {
		arrayList = new int[size];
		index = 0;
	}
	void add(int value) {
		arrayList[index] = value;
		index++;
	}
	/** 
	 * Insert an integer value at the specified index
	 */
	void add(int index, int value) {
		arrayList[index] = value;
	}
	/**
	 * Return the integer value at the endspecified index
	 */
	int get(int index) {
		if(arrayList[index] != 0) {
			return arrayList[index];
		}
		else
			return -1;
	}
	/**
	 * Return the index of the specified value in the list/array. 
	 */
	int indexOf(int value) {
		for(int i = 0; i < arrayList.length; i++) {
			if(value == arrayList[i])
				return i;
		}
		return -1;
	}
	
	boolean isEmpty() {
		if(arrayList.length != 0)
			return false;
		else
			return true;
	}
	
	int remove(int index) {
		if(arrayList.length == 0)
			return 0;
		else
		{
		removedNum = arrayList[index];
		arrayList[index] = 0;
		return removedNum;
	}
	}
	
}
