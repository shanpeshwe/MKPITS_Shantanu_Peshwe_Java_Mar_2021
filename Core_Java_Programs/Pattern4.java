/*wap to print the pattern as given below
 *
 *	*
 *	*	*    -----------*/

public class Pattern4 {
    public static void main(String[] args){
        int a,b;
        for(a=1;a<=3;a++){
            for(b=1;b<=a;b++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
