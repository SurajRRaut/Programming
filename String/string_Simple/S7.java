package string_Simple;
//PRINT REVERSE STRING WITHOUT CHANING ITS MEAN AND CHECK IS PALINDROME OR NOT !!
public class S7 {
	public static void main(String[] args) {
		String str = "ab aa ba aa ab";
		String[]arr=str.split(" ");
		String revStr="";
		
		for(int i = arr.length-1;i>=0;i--) {
			
			revStr+=arr[i]+" ";
		}
		
		revStr=revStr.trim();//BECAUSE OF is IMMUTE OF STRING we will reinitialize the STRING
		
		System.out.println(revStr);
		
		if(str.equals(revStr)) {
			System.out.println("Its an palindrom");
		}
		else {
			System.out.println("its not palindrome");
		}
	}
}
