package string_Simple;
//PRINT REVERSE STRING WITHOUT CHANING ITS MEAN !!
public class S6 {
	public static void main(String[] args) {
		String str = "ab aa ba aa ab";
		String[]arr=str.split(" ");
		String revStr="";
		
		for(int i = arr.length-1;i>=0;i--) {
			
			revStr+=arr[i]+" ";
		}
		System.out.println(revStr);
	}
}
