package pyramidPattern_1;
//     A
//    BAB
//   CBABC
//  DCBABCD
public class V11 {
	public static void main(String[] args) {
        int line = 4;
        int star = 1;
        int space = 4;
        char ch1 = 'A';
        for (int i =0;i<line; i++){
        	char ch2 = ch1;
        	for(int k = 0; k<space;k++) {
        		System.out.print(" ");
        	}
            for(int j = 0;j<star; j++) {
            		System.out.print(ch2);
            	if(j<i) {
            		ch2--;
            	}
            	else {
            		ch2++;
            	}
            }
            System.out.println();
            space--;
            star+=2;
            ch1++;
        }
    }
}
