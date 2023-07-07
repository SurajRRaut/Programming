package string_Midlvl;
//OUTPUT>>>>PENDING
//Display number of occurence to there number...LIKE 10:3
//                                                   20:2
//                                                   30:2
//    Github Reposirtory                             40:1 REPEAT NUMEBR NOT ALLOWED...!!!
public class A7 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 40, 20, 30, 10};
        int n = arr.length;
    
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1; // Mark the duplicate number as -1
                }
            }
            if (arr[i] != -1) { // Check if the number has already been displayed
                System.out.println(arr[i] + " : " + count );
            }
        }
    }
}
