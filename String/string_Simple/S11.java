package string_Simple;
//OUTPUT ... This Is Programming Batch (FIRST LETTER SHOULD BE CAPITAL)
public class S11 {
    public static void main(String[] args) {
        String str = "this is programming Batch";
        String[]arr=str.split(" ");
		String ans ="";
        for(int i = 0;i<arr.length;i++){
            char ch =arr[i].toUpperCase().charAt(0); 
            ans+=ch+arr[i].substring(1)+" ";
                    
        }
        System.out.println(ans);
    }
}
