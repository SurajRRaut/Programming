package shapePattern_2;
//     1
//    23
//   345
//  4567
// 56789
public class U13 {
	public static void main(String[] args) {
	    int line = 5;
	    int star = 1;
	    int space =4;
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
	        star++;
	        ch1++;
	    }
	}
}
