package shapePattern_1;
// 1
// 12
// 123
// 1234
public class T7 {
	public static void main(String[] args) {
        int line = 4;
        int star = 1;

        for (int i =0;i<line; i++){
            int ch = 1;
            for(int j = 0;j<star; j++) {
                System.out.print(ch);
                ch++;

            }
            System.out.println();
            star++;
            
        }
    }
}
