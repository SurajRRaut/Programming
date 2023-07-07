package shapePattern_1;
// 1111
// 222
// 33
// 4
public class T9 {
	public static void main(String[] args) {
        int line = 4;
        int star = 4;
        int ch = 1;
        for (int i =0;i<line; i++){
            for(int j = 0;j<star; j++) {
                System.out.print(ch);

            }
            System.out.println();
            star--;
            ch++;
        }
    }
}
