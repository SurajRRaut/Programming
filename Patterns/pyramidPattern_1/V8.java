package pyramidPattern_1;
//    1
//   234
//  34567
// 45678910
public class V8 {
	public static void main(String[] args) {
        int line = 4;
        int star = 1;
        int space =3;
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
            space--;
            star+=2;
            ch1++;
        }
    }
}
