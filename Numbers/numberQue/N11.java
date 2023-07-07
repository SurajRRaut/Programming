package numberQue;
//PRINT FIBONNACCI SEREIES FIRST 10
public class N11 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1; 
		System.out.print(a+" "+b);
		  
		for (int x = 2 ; x<=10 ; x++){             
		     int c = a + b;
		     System.out.print(" "+c);           
		     a = b;
		     b = c;     
		}	  	   
	}
}

//OR >>>>>>>>>>>>>>>

//public static void main(String[] args) {
//	int n1 = 0;
//	int n2 = 1; 
//	for (int x = 0 ; x<10 ; x++){
//		 System.out.println(n1);
//	     int a = n1 + n2;           
//	     n1 = n2;
//	     n2 = a;     
//	}	  	   
//}


