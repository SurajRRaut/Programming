package pyramidPattern_1;
//   1
//  222
// 33333
public class V5 {
	public static void main(String[] args) {
        int line = 3;
        int star = 1;
        int space =2;
        int ch = 1;
        for (int i =0;i<line; i++){
        	
        	for(int k = 0; k<space;k++) {
        		System.out.print(" ");
        	}
            for(int j = 0;j<star; j++) {
                System.out.print(ch);
                
            }
            System.out.println();
            space--;
            star+=2;
            ch++;
        }
    }
}
