package pyramidPattern_2;
//   A
//  BCD
// CDEFG
//  DEF
//   E
public class W4 {
	public static void main(String[] args) {
        int line = 5;
        int star = 1;
        int space =2;
        char ch1 = 'A';
        for (int i =0;i<line; i++){
        	char ch2 = ch1;
        	for(int k = 0; k<space;k++) {
        		System.out.print(" ");
        	}
            for(int j = 0;j<star; j++) {
                System.out.print(ch2);
                ch2++;
            }
            ch1++;
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
