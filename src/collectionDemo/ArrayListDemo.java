package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//collections==>it is a framework which is collection of interfaces and classes
		//used for fetching data, deleting data, sorting data, manipulating data
		//Arrays:collection of data-->length of the array	 is fixed
		//int [] array1= new int[5];
		//we have an array--array1, storing only integer and number of values is 5=static data
		//Arraylist==>used to store dynamic data and size of the array is not fixed
		//array can grow dynamically
		//ArrayList class is util package in java
		ArrayList arr1= new ArrayList();//here arr1 is an object
		//To add values in th arraylist==>add()
		arr1.add(12);
		arr1.add("upasana");//we can add different datatype as well
		arr1.add(2.34);
		arr1.add(true);
		//size of arraylist==>size()
		int x = arr1.size();
		System.out.println("Size of the araylist:" + x);
		//use for loop to print arraylist
		for (int i=0; i<arr1.size(); i++)
		{
			System.out.println(arr1.get(i));
		}
		//Or
		//to fetch values from an arraylist use iterator()method
		Iterator it= arr1.iterator();//Iterator is a method here, "it" is an object here
		while (it.hasNext())//hasnext means it will print till it has next value
		{
			System.out.println(it.next());
		}
		
	//non generic arraylist==>adding the data type,ensuring only particular data type is stored
		//Integer type arrayList
		ArrayList<Integer> arr2= new ArrayList<Integer>();
		arr2.add(12);
		//arr2.add("upasana");//it will give error if added data type other than integer
		//String type arrayList
		ArrayList<String> arr3= new ArrayList<String>();
		arr3.add("upasana");
		arr3.add("upasana1");
		arr3.add("garg");
		arr3.add("garg1");
		//advanced for loop==>for each loop==>it's much faster than for loop.It can 
		//be used only for non-generic type of arraylist
		for
		(String temp:arr3)//temp is an object
		{
			System.out.println(temp);
		}
		
	//Removing the values from arrayList
		arr3.remove(0);//to remove the value from index 0 only from the arraylist
		arr3.removeAll(arr3);//to remove all the values from the arraylist
	}
}
		
		
		
		
	


