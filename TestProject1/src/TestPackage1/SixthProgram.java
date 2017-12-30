package TestPackage1;

import java.util.*;

public class SixthProgram {

	
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Ramesh");
		hm.put(2, "Venkat");
		hm.put(3, "Prem");
		
		for(Map.Entry m : hm.entrySet()){
			System.out.println("value: " + m.getValue()+ "  key: " + m.getKey() );
			
		}
		
		
	}
	
}
