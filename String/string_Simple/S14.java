package string_Simple;
import java.util.Arrays;
//Output ....this is programming batch
public class S14 {
    public static void main(String[] args) {
        String str = "2is ba4tch t1his pr3ogramming";
        String[] words =str.split(" ");
        String[] ans = new String[words.length];
        
        for(String s : words) {
            char[] chArr=s.toCharArray();
            Arrays.sort(chArr);
            int idx = chArr[0]-'0';
            String wds = s.replace(idx+"", "");
            System.out.println(idx+"  :  "+wds);
            ans[idx-1]= wds;
        }
        System.out.println(Arrays.toString(ans));
    }
}
