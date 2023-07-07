package shapePattern_2;
// 1234
//  234
//   34
//    4
public class U10 {
	public static void main(String[] args) {
        int line = 4;
        int star = 4;
        int space =0;
        int ch1 = 1;
        for (int i =0;i<line; i++){	
        	int ch2 = ch1;
        	for(int k = 0; k<space;k++) {
        		System.out.print(" ");
        	}
            for(int j = 0;j<star; j++) {
                System.out.print(ch2);
                ch2++;
            }
            System.out.println();
            space++;
            star--;
            ch1++;
        }
    }
}
