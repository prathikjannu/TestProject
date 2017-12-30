package TestPackage1;

public class ThirdSubprogram extends ThirdProgram{

	@Override
	public void add() {
		int i  = 10;
		int j = 10;
		int z = i + j;
		System.out.println("calling abstract  add method result : "  + z);
		
	}
	public static void main(String[] args) {
		ThirdSubprogram TS = new ThirdSubprogram();
		TS.add();
		TS.multi();
	}
	
	
	
	

}
