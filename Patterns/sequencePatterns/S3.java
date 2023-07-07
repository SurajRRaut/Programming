package sequencePatterns;
// 1234
// 3456
// 5678
// 5678
public class S3 {
	public static void main(String[] args) {
		int line = 4;
		int star = 4;
		int ch = 1;
		
	
		for (int i = 0 ;i<line;i++ ) {
			
			for (int j = 0 ;j<star;j++ ) {
				System.out.print(ch);
				ch++;
			}
			if(ch==4) {
			ch = 2;
			}
			else if  (ch==5)
			{
				ch = 3;
			}
			else if (ch==6){
				ch = 4;
			}
			else {
				ch = 5;
			}
			System.out.println();		
		}
	}
}
