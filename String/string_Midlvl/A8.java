package string_Midlvl;
//OUTPUT>>>>PENDING
//Display number of occurence to there number...LIKE 10:3
//                                                   20:2
//                                                   30:2
//                                                   40:1 REPEAT NUMEBR IS ALLOWED...!!!
public class A8 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,10,40,20,30,10};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " : "+ count);
        }
    }
}
