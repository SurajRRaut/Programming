package sequencePatterns;
// 11111
// *****
// 22222
// *****
// 33333
public class S17 {
	public static void main(String[] args) {
		
		int line = 5;
		int star = 5;
		int ch = 1;
		for (int i = 0;i<line;i++) {
			
			for (int j = 0; j<star; j++) {
				
				if(i%2!=0) {
					System.out.print("*");
				}
				else {
				 System.out.print(ch);	 
				}		
			}
			if(i%2==0) {
				ch++;
			}
			System.out.println();
		}
	}
}
