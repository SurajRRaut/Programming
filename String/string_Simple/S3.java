package string_Simple;
//ROTATE THE STIRNG BY CHAR
public class S3 {
	public static void main(String[] args) {
		String str = "PROGRAM";
		int star =7;
		int line =7;
		int ch = 0;
		for(int i =0 ;i<line;i++) {
			int ch2= ch;
			for(int j=star-1;j>=0;j--) {
				System.out.print(str.charAt(ch2));
				ch2++;
				if(ch2==str.length()) {
					ch2=0;
				}
			}
			ch++;
			System.out.println();
		}
	}
}
