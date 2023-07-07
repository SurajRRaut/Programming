package string_Simple;
//ROTATE THE STIRNG BY String
public class S4 {
	public static void main(String[] args) {
		String str = "PROGRAM";
		int star =str.length();
		int line =str.length();
		int ch = 0;
		for(int i =0 ;i<line;i++) {
			String s = "";
			int ch2= ch;
			for(int j=0;j<star;j++) {
				s+=str.charAt(ch2++);
				if(ch2==str.length()) {
					ch2=0;
				}
			}
			ch++;
			System.out.println(s);
		}
	}
}
