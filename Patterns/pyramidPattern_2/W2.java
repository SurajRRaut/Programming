package pyramidPattern_2;
//   1
//  222
// 33333
//  444
//   5
public class W2 {
	public static void main(String[] args) {
        int line = 5;
        int star = 1;
        int space =2;
        int ch1 = 1;
        for (int i =0;i<line; i++){
        	for(int k = 0; k<space;k++) {
        		System.out.print(" ");
        	}
            for(int j = 0;j<star; j++) {
                System.out.print(ch1);
            }
            System.out.println();
            ch1++;
            if(i<2) {
            	space--;
                star+=2;
            }
            else {
            	space++;
                star-=2;
            }         
        }
    }
}
