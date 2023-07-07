package string_Midlvl;
//CHECK TWO THE STRING CONTAINS SAME LETTER OR NOT
//NOTE : CODE MODULARITY >> REUSE THE CODE 
public class A5 {
    public static void sorting(char arr[]){
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length-1-i;j++) { 
				if(arr[j]>arr[j+1]) {
					char temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
    }
    public static void main(String[] args) {
        String str1 = "MKLRY";
        String str2 = "AMRY";
		if(str1.length()==str2.length()){
			char ch1 []=str1.toCharArray();
			char ch2 []=str2.toCharArray();
			sorting(ch1); //ALWAYS SORT BT CREATING EXTERNAL METHOD WOTH AN ANY SORINTING ALGORITHM
			sorting(ch2);
			int count = 0;
			for(int i = 0;i<ch1.length;i++){
				if(ch1[i]==ch2[i]){
					count++;
				}
			}
			if(count==ch1.length){
				System.out.println("YES ITS AN SAME STRING WITH SAME LETTERS");
			}
			else{
				System.out.println("LENGTH IS THE SAME BUT LETTERS ARE NOT SAME");
			}
		}
		else{
			System.out.println("ITS NOT SAME STRING (LENGTH IS MISMATCHED)");
		}
    }
}
