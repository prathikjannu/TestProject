package TestPackage1;

public class LargestInteger {
static int Largest;

public static void main(String[] args) {
	int a[] = {4,8,9,15,3,19,5,1};
	int len = a.length;
	
	Largest = a[0];
	for(int i=0;i<=len-1;i++){
		if(a[i]>Largest){
			Largest = a[i];
		}
		
	}System.out.println("largest value of array: "+Largest);
	
}

	
	
}
