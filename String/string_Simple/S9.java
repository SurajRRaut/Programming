package string_Simple;
//SUM ALL THE NUMBERS FROM STRING
//METHOD 1 : BY MINUS ASKII VALUE
public class S9 {
	public static void main(String[] args) {
		String str = "12345678";
		int a = 0;
		for(int i=0;i<str.length();i++) {
			int b =str.charAt(i) -'0';
			a+=b;
		}
		System.out.println("SUMATION IS : "+a);
	}
}
