package string_Simple;
//REVERSE THE STRING
public class S1 {
	public static void main(String[] args) {
		String str = "PROGRAM";
		String revStr = "";
		for(int i = str.length()-1;i>=0;i--) {
			revStr+=str.charAt(i);
			
		}
		System.out.println(revStr);
	}
}
