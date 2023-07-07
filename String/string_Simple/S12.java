package string_Simple;
//OUTPUT ...last letter should be Capital and all is in lower
public class S12 {
    public static void main(String[] args) {
        String str = "this is programming Batch";
        String[] arr = str.split(" ");
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            char lastLetter = Character.toUpperCase(word.charAt(word.length() - 1));
            String modifiedWord = word.substring(0, word.length() - 1) + lastLetter;
            ans += modifiedWord + " ";
        }
        System.out.println(ans);
    }
}
