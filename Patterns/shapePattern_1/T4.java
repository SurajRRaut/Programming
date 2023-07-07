package shapePattern_1;
// A
// **
// CCC
// **
// E
public class T4 {
	public static void main(String[] args) {
        int line = 5;
        int star = 1;
        char ch = 'A';
        for (int i =0;i<line; i++){
            for(int j = 0;j<star; j++) {
            	
            	if(i%2!=0) {
            		System.out.print("*");
            	}
            	else {
            		System.out.print(ch);
            	}    
            }
            ch++;
            System.out.println();
            if(i<2){
                star++;
            }
            else{
                star--;
            }
        }
    }
}
