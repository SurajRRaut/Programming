package string_Midlvl;
import java.util.ArrayList;
import java.util.List;
//PRINT BETWEEN VALUES OF ( D1 TO G3 )....!! Like >>>>>>> [D1, D2, D3, E1, E2, E3, F1, F2, F3, G1, G2, G3]
public class A2 {
    public static void main(String[] args) {
        String str = "D1:G3";
        List<String> rows =selectRows(str);
        System.out.println(rows);
    }

    public static List<String> selectRows(String str){
        List<String> ans = new ArrayList<>();
        char st = str.charAt(0);
        char ed = str.charAt(3);
        while(st<=ed){
            char nst = str.charAt(1);
            char ned = str.charAt(4);
            while(nst<=ned){
                ans.add(st+""+nst);
                nst++;
            }
            st++;
        }
        return ans;
    }
}
