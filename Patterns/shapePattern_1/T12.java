package shapePattern_1;
// 1234
// 234
// 34
// 4
public class T12 {
	public static void main(String[] args) {
        int line = 4;
        int star = 4;
        int ch1 = 1;
        for (int i =0;i<line; i++){
            int ch2=ch1;
            for(int j = 0;j<star; j++) {
                System.out.print(ch2);
                ch2++;
            }
            System.out.println();
            star--;
            ch1++;           
        }
    }
}
