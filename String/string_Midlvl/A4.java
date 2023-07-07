package string_Midlvl;
//DISPLAY TOTAL BALANCED STRING
public class A4 {
    public static void main(String[] args) {
        String str = "QJQQJJQJ";
        int countQ =0;
        int countJ =0;
        int balancedStr = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) =='Q'){
                countQ++;
            }
            else{
                countJ++;
            }
            if(countJ==countQ){
                balancedStr++;
            }
        }
        System.out.println("TOTAL BALANCED STRINGS ARE : "+balancedStr);
    }
}

/*OR>>>>>
public class A4 {
    public static void main(String[] args) {
        String str = "QJQQJJQJ";
        int a =0;
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) =='Q'){
                a++;
            }
            else{
                a--;
            }
            if(a==0){
                count++;
            }
        }
        System.out.println("TOTAL BALANCED STRINGS ARE : "+count);
    }
}
*/
