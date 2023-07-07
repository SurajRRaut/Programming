package string_Midlvl;
//GIVE SPACE ....OUTPUT LIKE >>>>> This Is Programming Batch<<<<<<<<<<
public class A6 {
    public static void main(String[] args) {
        String str = "ThisIsProgrammingBatch";
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                ans += " ";
            }
            ans += c;
        }
        System.out.println(ans);
    }
}
