/*wap to print the pattern as given below
	1	3	5
	1	3	5
	1	3	5
*/

public class Pattern6 {
    public static void main(String[] args) {
        int a,b,c=2;
        for(a=1;a<=3;a++)
        {
            for(b=1;b<=5;b=b+2)
            {
                System.out.print(b+"\t");
            }
            System.out.println();
        }
    }
}
