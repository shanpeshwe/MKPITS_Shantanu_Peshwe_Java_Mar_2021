/*wap to print the pattern as given below
	1
	1	2
	1	2	3
using nested for loop*/

public class Pattern3 {
    public static void main(String[] args) {
        int a, b;

        for (a = 1; a <= 3; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print(b + "\t");
            }
            System.out.println();
        }
    }
}
