package string_Simple;
//CHECK STRING PALINDROME OR NOT !! 
public class S2 {
	public static void main(String[] args) {
		String str = "NITIN";
		String revStr = "";
		for(int i = str.length()-1;i>=0;i--) {
			revStr+=str.charAt(i);	
		}
		if(str.equals(revStr)) {
			System.out.println("String is an palindrom");
		}
		else {
			System.out.println("Its not an palindrom");
		}
	}
}
