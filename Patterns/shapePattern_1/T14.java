package shapePattern_1;
// 1
// 25
// 368
// 47910
public class T14 {
	public static void main(String[] args) {
        int line = 4;
        int star = 1;
        int ch1 = 1; 
        for (int i =0;i<line; i++){
            int ch2=ch1;
            int ch3 = 3;
            for(int j = 0;j<star; j++) {
                System.out.print(ch2);
                ch2+=ch3;
                ch3--;
            }
            System.out.println();
            star++; 
            ch1++;
        }
    }
}
