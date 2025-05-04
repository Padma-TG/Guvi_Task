//creating a tree map and sort the values in ascending order
package dayFourTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class dayfourq6treemap
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1,"Padma");
		map.put(2,"Goutam");
		map.put(3,"Aadhini");
		map.put(4,"Pranav");
		map.put(5,"John");
		System.out.println(map);
		List<Map.Entry<Integer, String>> sortedByValue = new ArrayList<>(map.entrySet());
		sortedByValue.sort(Map.Entry.comparingByValue());

		for (Map.Entry<Integer, String> entry : sortedByValue) {
		    System.out.println(entry.getValue());
		}
		
	}

}
