package TestPackage1;

public class ninthPrgraom {
	public static void main(String[] args) {
		int n = 10;
		for(int i = 0;i<=n;i++){
			System.out.println(i);
		}
		
		do{
			n = n + 1;
			System.out.println(n);
		}while(n<10);
		
		switch (n=11){
		case 1 : System.out.println("i" + 1);
		case 2 : System.out.println("i" + 2);
		case 11 : System.out.println("i : " + 11);
	//	default : System.out.println("i" + "default");
		}
			
		
	}

}
