package starPatterns;
// **********
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// **********
public class R1 {
	public static void main(String argss[]) {
		int star = 10;
		int line = 10;
		for(int i = 0;i<line;i++) {
			for(int j = 0;j<star;j++) {
				if(i==0||j==0||i==9||j==9) {
					System.out.print("*");
				}else {		
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
