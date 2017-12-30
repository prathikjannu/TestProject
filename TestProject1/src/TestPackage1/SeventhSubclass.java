package TestPackage1;

public class SeventhSubclass extends SeventhProgram {
	
	public void valuesgiven(int x, int y){
		int z =  x * y ;
		System.out.println("returns multiplication value " + z);
	}

	
	public static void main(String[] args) {
		SeventhProgram sb = new  SeventhSubclass();
		sb.valuesgiven(2, 4);
	}
	
}
