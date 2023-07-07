package pyramidPattern_1;
//     0
//    101
//   21012
//  3210123
// 432101234
public class V10 {
	public static void main(String[] args) {
        int line = 5;
        int star = 1;
        int space = 4;
        int ch1 = 0;
        for (int i =0;i<line; i++){
        	int ch2 = ch1;
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
