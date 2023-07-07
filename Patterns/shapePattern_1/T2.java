package shapePattern_1;
// 1
// 12
// 123
// 12
// 1
public class T2 {
	public static void main(String[] args) {
        int line = 5;
        int star = 1;
        for (int i =0;i<line; i++){
        	int ch = 1;
            for(int j = 0;j<star; j++) {
                System.out.print(ch);
                ch++;
            }    
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
