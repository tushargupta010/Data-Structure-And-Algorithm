package arrays;

import java.util.ArrayList;

/*
 * ArrayList will grow on its own.
 * 'new' keyword is used so memory is allocated in heap.
 * it is just an array but dynamic in nature.
 * default size = 0,because no element is added
 * default capacity is 2.
 * 
 * if(size == capacity) {
 * 		create a new array of size = 2 * capacity
 * 		copies each element of previous array into new array
 * }
 * 
 * list.get(index);
 * index starting with 0
 * if(index > size) throw IndexOutOfBound Exception
 * 
*/

public class ArrayListPractice {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list);
		System.out.println(list.size());

		list.add(10);
		System.out.println(list);
		System.out.println(list.size());

	}

}
