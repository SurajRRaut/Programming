package numberQue;
//COUNT THE ALL PERFECT NUMBER BETWEEN 1 - 1000
public class N8 {
	public static void main(String[] args) {
		int count = 0;
      for (int j = 1;j<1000;j++) {
      	int add = 0;
      	for(int i =1;i<j;i++) {
  			if(j%i==0) {
  				add+=i;
  			}
  		}
  		if(j == add) {
  			count++;
  		}
      }
      System.out.println("total perfect number between 1 - 1000 are : "+count);
	}
}

