package shapePattern_1;
// 1234
// 123
// 12
// 1
public class T8 {
	public static void main(String[] args) {
        int line = 4;
        int star = 4;

        for (int i =0;i<line; i++){
            int ch = 1;
            for(int j = 0;j<star; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            star--;       
        }
    }
}
