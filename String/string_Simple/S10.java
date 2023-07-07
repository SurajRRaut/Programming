package string_Simple;
//SUM ALL THE NUMBERS FROM STRING
//METHOD 2 : BY USING ParseInt METHOD
public class S10 {
	public static void main(String[] args) {
		String str = "12345678";
		int a = 0;
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			int b = Integer.parseInt(ch+"");
			System.out.println(b);
			a+=b;
		}
		System.out.println("SUMATION IS : "+a);
	}
}
