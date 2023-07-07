package sequencePatterns;
// 4321
// 3210
// 2100
// 1000
public class S12 {
public static void main(String[] args) {
		
		int line = 4;
		int star = 4;
		int ch1 = 4;
		for (int i = 0;i<line;i++) {
			int ch2 = ch1;
			for (int j = 0; j<star; j++) {
				System.out.print(ch2);
				ch2--;
				if (ch2 == -1) {
					ch2++;
				}
			}
			ch1--;	
			System.out.println();
		}
	}
}

//OR>>>>>>>>>>>>>>>>>
//public class S12 {
//	public static void main(String[] args) {
//		
//		int line = 4;
//		int star = 4;
//		int ch1 = 4;
//		for (int i = 0;i<line;i++) {
//			int ch2 = ch1;
//			for (int j = 0; j<star; j++) {
//				System.out.print(ch2);
//				ch2--;
//				if (ch2 < 0) {
//					ch2 = 0;
//				}
//			}
//			ch1--;	
//			System.out.println();
//		}
//	  }
//}
