package shapePattern_2;
// 1111
//  222
//   33
//    4
public class U4 {
	public static void main(String[] args) {
        int line = 4;
        int star = 4;
        int space =0;
        int ch = 1;
        for (int i =0;i<line; i++){  	
        	for(int k = 0; k<space;k++) {
        		System.out.print(" ");
        	}
            for(int j = 0;j<star; j++) {
                System.out.print(ch);
            }
            System.out.println();
            space++;
            star--;
            ch++;
        }
    }
}
