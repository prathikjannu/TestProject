package TestPackage1;

public class PallindromeEx {
	
	public static void main(String[] args) {
		int n = 454;
		int temp = n;
		int result = 0;
		
		
		
		
		
		while(n>0){
			int j = n%10;
			n=n/10;
			result = result * 10 + j;
		}
		if(result == temp){
			System.out.println("given value is pallindrome");
		}else{
			System.out.println("given value is not pallindrome");
		}
	}

}
