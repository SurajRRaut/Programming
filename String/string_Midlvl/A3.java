package string_Midlvl;
//CHECK ITS BLACK OR WHITE BOXXX in CHESS
public class A3 {
    public static void main(String[] args) {
        String str = "A8";
        int ch1 = str.charAt(0)-'@';//or 64 bcz a askii value is 64 
        int ch2 = str.charAt(1)-'0';
        if((ch1+ch2)%2==0){
            System.out.println("WHITE COLOR");
        }
        else{
            System.out.println("BLACK COLOR");
        }
    }
}
