
public class PrimeNumbers
{
	public static void main(String[] args) {
		int i, j;
        boolean isPrime;

        for (i = 1; i <= 20; i++) {
            if (i == 1 || i == 0)
                continue;
            isPrime = true;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(i + " ");
        }
    }
}







