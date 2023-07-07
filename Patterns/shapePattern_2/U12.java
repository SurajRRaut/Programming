package shapePattern_2;
//     *
//    BB
//   ***
//  DDDD
// *****
public class U12 {
	public static void main(String[] args) {
        int line = 5;
        int star = 1;
        int space =4;
        char ch1 = 'A';
        for (int i =0;i<line; i++){	
        	
        	for(int k = 0; k<space;k++) {
        		System.out.print(" ");
        	}
            for(int j = 0;j<star; j++) {
            	if(i%2==0) {
            		System.out.print("*");
            	}
            	else {
            		System.out.print(ch1);
            	}    
            }
            System.out.println();
            space--;
            star++;
            ch1++;
        }
    }
}
