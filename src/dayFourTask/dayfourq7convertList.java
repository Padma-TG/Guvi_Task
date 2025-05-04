package dayFourTask;

import java.util.ArrayList;
import java.util.Arrays;

public class dayfourq7convertList 
{

	public static void main(String[] args) 
	{
		ArrayList<String> arrlis = new ArrayList<String>();
		arrlis.add("Padma");
		arrlis.add("Goutam");
		arrlis.add("Risshan");
		
		String[] sarr=arrlis.toArray(new String[0]);
		System.out.println(Arrays.toString(sarr));
		
	}

}
