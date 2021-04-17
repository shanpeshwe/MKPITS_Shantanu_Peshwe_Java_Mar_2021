/*wap to print the pattern as given below
	1	2	3
	1	2
	1                         */

public class Pattern5 {
    public static void main(String[] args) {
        int a,b;
        for(a=3;a>0;a--) {
            for(b=1;b<=a;b++) {
                System.out.print(b+"\t");
            }
            System.out.println();
        }
    }
}
