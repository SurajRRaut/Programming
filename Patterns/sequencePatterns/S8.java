package sequencePatterns;
// A*C*E
// A*C*E
// A*C*E
// A*C*E
public class S8 {
	public static void main(String[] args) {
		int line = 4;
		int star = 5;
		
		for (int i = 0;i<line;i++) {
			char ch1 = 'A';
			for (int j = 0; j<star; j++) {
				
				if (j%2==0) {
				  
					System.out.print(ch1);
					ch1++;
					ch1++;
				}
				else {
					System.out.print("*");
				}
			}			
			System.out.println();
		}
	}
}
