//wap to print prime no between 1 and 20.

public class PrintPrimeNosBeth1To20 {
    public static void main(String[] args) {

        int num = 20, count;
        int rem,i,j;

        for (i = 2; i <= num; i++) {
            count = 0;
            for (j = 2; j  <= i / 2; j++) {
                rem=i%j;
                if (rem == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }

        }
    }
}