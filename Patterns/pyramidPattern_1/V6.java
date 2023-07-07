package pyramidPattern_1;
//    1
//   2 2
//  3 3 3
// 4 4 4 4
public class V6 {
	public static void main(String[] args) {
        int line = 4;
        int star = 1;
        int space =3;
        int ch = 1;
        for (int i =0;i<line; i++){
        	
        	for(int k = 0; k<space;k++) {
        		System.out.print(" ");
        	}
            for(int j = 0;j<star; j++) {
                System.out.print(ch+" ");
                
            }
            System.out.println();
            space--;
            star++;
            ch++;
        }
    }
}
