package numberQue;
//FIND PERFECT NUMBER ETWEEN 1 - 100
public class N7 {
	public static void main(String[] args) {
      for (int j = 1;j<100;j++) {
      	int add = 0;
      	for(int i =1;i<j;i++) {
  			if(j%i==0) {
  				add+=i;
  			}
  		}
  		if(j == add) {
  			System.out.println("There are perfect number between 1 - 100 : "+j);
  		}
      }	
	}
}
