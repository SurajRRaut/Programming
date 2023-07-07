package string_Simple;
//FIND CAPITAL LETTER FROM STRING
public class S5 {
	public static void main(String[] args) {
		String str = "CoreJava";
		for(int i =0 ;i<str.length();i++) {
			int a =str.charAt(i);
			if(a<97) {//By Askii Value
				System.out.println("THE CAPITAL LETTER ARE : "+ (char)a);
			}
		}
	}
}

