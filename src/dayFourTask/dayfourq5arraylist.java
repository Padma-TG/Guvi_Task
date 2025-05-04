//to create arraylist of string and then remove all the elements from arraylist
package dayFourTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dayfourq5arraylist 
{

	public static void main(String[] args) 
	{
//		ArrayList<String> str=new ArrayList<>(Arrays.asList("Padma","Goutam","Risshan","Rudhu","Lily"));
//		str.add("Padma");
//		str.add("Goutam");
//		str.add("Aadhini");
//		System.out.println(str);
//		for(String str1:str)
//		{
//			System.out.println(str1);
//		}
		//arrays.aslist dont let u add fields in future
	//	List<String> str=Arrays.asList("Padma","Goutam","Risshan","Rudhu","Lily");
		//so new ArrayList<>(Arrays.asList) allows you to add fields in future
	ArrayList<String> str=new ArrayList<>(Arrays.asList("Padma","Goutam","Risshan","Rudhu","Lily","John","Jyo"));

		System.out.println(str);
		str.add("rose");
		System.out.println(str);
		//removing by index
		str.remove(4);
		System.out.println("REmoved  lily from str " +str);
		//removing by name
		str.remove("John");
		System.out.println("Removed John from str "+str);
		//removing more
		str.removeAll(Arrays.asList("Padma","Goutam"));
		System.out.println(str);


	}

}
