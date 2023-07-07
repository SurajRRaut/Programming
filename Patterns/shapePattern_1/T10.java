package shapePattern_1;
// 4
// 34
// 234
// 1234
public class T10 {
	public static void main(String[] args) {
        int line = 4;
        int star = 1;
        int ch1 = 4;
        for (int i =0;i<line; i++){
            int ch2=ch1;
            for(int j = 0;j<star; j++) {
                System.out.print(ch2);
                ch2++;
            }
            System.out.println();
            star++;
            ch1--;         
        }
    }
}
