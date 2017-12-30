package TestPackage1;

import java.util.*;

public class FourthProgram {
	
	public List display() {
		ArrayList al = new ArrayList();
		al.add("InfoSmart");
		al.add("Technologies");
		return al;

	}
	

	public static void main(String[] args) {
		FourthProgram FP = new FourthProgram();
		List ab = FP.display();
		System.out.println(ab);
		
	}
	
}
