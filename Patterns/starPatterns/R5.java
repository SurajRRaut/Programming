package starPatterns;
// * * * * * * * * * * *
// *                   *
// *                   *
// *                   *
// *                   *
// *         *         *
// *                   *
// *                   *
// *                   *
// *                   *
// * * * * * * * * * * *
public class R5 {
	public static void main(String[] args) {
		int line = 11;
		int star = 11;
		for(int i =0;i<line;i++) {
			for(int j=0;j<star;j++) {
				if(i==0||j==0||i==10||j==10||i==5 && j==5) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
