package pyramidPattern_2;
//   1
//  123
// 12345
//  123
//   1
public class W3 {
	public static void main(String[] args) {
        int line = 5;
        int star = 1;
        int space =2;
        
        for (int i =0;i<line; i++){
        	int ch1 = 1;
        	for(int k = 0; k<space;k++) {
        		System.out.print(" ");
        	}
            for(int j = 0;j<star; j++) {
                System.out.print(ch1);
                ch1++;
            }
            System.out.println();
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
