package TestPackage1;

import java.util.*;

public class FifthProgram {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Prathik");
		al.add("Vishnu");
		al.add("Karun");
		al.add("vennela");
		System.out.println(al);
		int i = 0;
		Iterator it =  al.iterator();
	   while (it.hasNext()){
		   System.out.println("Traversing through arrayList: " + i +"  " + it.next());
		   i++;
	   }
		
		
	}
	
}
