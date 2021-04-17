/*wap to print the pattern given below
	1
	1	3
	1	3	5
*/

public class Pattern7 {
    public static void main(String[] args) {
        int a,b,c=1;
        for(a=1;a<=3;a++) {
            c=c+2;
            for(b=1;b<c;b=b+2)
            {
                System.out.print(b+"\t");
            }
            System.out.println();
        }
    }
}
