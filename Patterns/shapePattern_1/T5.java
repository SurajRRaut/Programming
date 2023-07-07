package shapePattern_1;
// A
// A*
// A*B
// A*B*
// A*B
// A*
// A
public class T5 {
	public static void main(String[] args) {
        int line = 7;
        int star = 1;
        for (int i =0;i<line; i++){
        	char ch = 'A';
            for(int j = 0;j<star; j++) {	
            	if(j%2!=0) {
            		System.out.print("*");
            	}
            	else {
            		System.out.print(ch);
            		ch++;
            	}    
            }
            System.out.println();
            if(i<3){
                star++;
            }
            else{
                star--;
            }
        }
    }
}
