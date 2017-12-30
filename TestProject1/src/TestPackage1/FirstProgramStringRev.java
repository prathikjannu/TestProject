package TestPackage1;
public class FirstProgramStringRev {
	
	
	public static void main(String[] args) {
		String s = "InfoSmart";
		int len = s.length();
		String p = "";
		for(int j= len-1;j>=0;--j){
			p = p + s.charAt(j);
			if(j==0){
				System.out.println(p);
			}
		}
		
	}

}
