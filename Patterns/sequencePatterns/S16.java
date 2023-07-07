package sequencePatterns;
// 1*2*3
// 1*2*3
// 1*2*3
// 1*2*3
public class S16 {
	public static void main(String[] args) {
		
		int line = 4;
		int star = 5;
		
		for (int i = 0;i<line;i++) {
			int ch = 1;
			for (int j = 0; j<star; j++) {
				
				if(j%2!=0) {
					System.out.print("*");
				}
				else {
				 System.out.print(ch);
				 ch++;
				}	
			}
			System.out.println();
		}
	}
}
