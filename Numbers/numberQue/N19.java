package numberQue;
//FIND AMRSTRONG NUMBER INBETWEEN OF 1 - 10000
public class N19 {
	public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int number = i;
            int originalNumber = number;
            int numDigits = 0;
            while (originalNumber != 0) {
                numDigits++;
                originalNumber /= 10;
            }
            originalNumber = number;
            int sum = 0;
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                int digitPower = 1;
                for (int j = 1; j <= numDigits; j++) {
                    digitPower *= digit;
                }
                sum += digitPower;
                originalNumber /= 10;
            }
            if (sum == number) {
                System.out.println(number + " is an Armstrong number.");
            }
        }
    }
}
