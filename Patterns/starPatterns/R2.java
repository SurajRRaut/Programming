package starPatterns;
// **********
// **      **
// * *    * *
// *  *  *  *
// *   **   *
// *   **   *
// *  *  *  *
// * *    * *
// **      **
// **********
public class R2 {
	public static void main(String[] args) {
		int line = 10;
		int star = 10;
		for(int i =0;i<line;i++) {
			for(int j=0;j<star;j++) {
				if(i==0||j==0||i==9||j==9||i==j||i+j==9) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
