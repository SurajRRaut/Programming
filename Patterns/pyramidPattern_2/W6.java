package pyramidPattern_2;
//    A
//   BBB
//  CCCCC
// DDDDDDD
//  CCCCC
//   BBB
//    A
public class W6 {
	public static void main(String[] args) {
        int line = 7;
        int star = 1;
        int space = 3;
        char ch1 = 'A';
        for (int i =0;i<line; i++){
        	for(int k = 0; k<space;k++) {
        		System.out.print(" ");
        	}
            for(int j = 0;j<star; j++) {
                System.out.print(ch1);
            }
            
            System.out.println();
            if(i<3) {
            	space--;
                star+=2;
                ch1++;
            }
            else {
            	space++;
                star-=2;
                ch1--;
            }         
        }
    }
}
