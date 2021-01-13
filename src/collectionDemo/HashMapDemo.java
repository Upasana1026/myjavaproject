package collectionDemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Hashmap also create a list but in this list we store the data in following format
		//key, value==key should be unique here
		//It can be integer, string data or integer, integer data or String, String data
		//(101, "jack")
		HashMap<Integer, String> hmap= new HashMap<Integer, String>();
		hmap.put(101,"jack");
		hmap.put(102,"Tom");
		hmap.put(103,"Dave");
		hmap.put(104,"Maya");
		hmap.put(105,"Tim");//here integer data(key) should be different, string can be same
		
		System.out.println(hmap.get(101));//Tom
		System.out.println(hmap.get(103));//Dave
		System.out.println(hmap);//{101=jack, 102=Tom, 103=Dave, 104=Maya, 105=Tim}
		
		for(Integer temp:hmap.keySet())
		{
			System.out.println(temp);//will print only the keys 101, 102...
			System.out.println(hmap.get (temp));
			
		}
		
		
	}

}
