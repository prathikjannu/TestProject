package TestPackage1;
public class SecondProgramDuplicate {

	
	public static void main(String[] args) {
		int []a = {5,8,3,2,6,5,9,2,4,3};
	//	int []b = new int[3];
	 int len = a.length;
		
		
	 for(int i=0;i<=len-1;i++){
		 int count = 0;
		 for(int j=i+1;j<=len-1;j++){
			 if(a[j]==a[i]){
				 count = count + 1;
				
				
				 //System.out.println(b[u]);
			 }
		 }
		 if(count != 0){
			 System.out.println(a[i]);
			
		 }
	
	 }
	
		
	}
	
}
