package pyramidPattern_1;
//    1
//   234
//  51234
// 5123451
public class V9 {
	public static void main(String[] args) {
        int line = 4;
        int star = 1;
        int space =3;
        int ch1 = 1;
        for (int i =0;i<line; i++){
        	for(int k = 0; k<space;k++) {
        		System.out.print(" ");
        	}
            for(int j = 0;j<star; j++) {
                System.out.print(ch1);
                ch1++; 
                if(ch1>5) {
                	ch1=1;
                }
            }
            System.out.println();
            space--;
            star+=2;
        }
    }
}
