package string_Simple;
//OUTPUT >>>> This is Programming Batch
import java.util.Arrays;

public class S13 {
    public static void main(String[] args) {
        String[] arr ={"2is","4Batch","1This","3Programming"};
        String ans = "";
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++) {
            ans+=arr[i].substring(1)+" "; 
        }
        System.out.println(ans);
    }
}

/* OR>>>>>>>>>>>>
        public static void main(String[] args) {
        String str = "2is 4batch 1this 3programming";
        String[] arr =str.split(" ");
        String[] strArr = new String[arr.length];
        
        for(String s : arr) {
            int idx = s.charAt(0)-'0';
            String temp = s.substring(1);
            strArr[idx-1]=temp; 
        }
        System.out.println(Arrays.toString(strArr));
    }
 */
