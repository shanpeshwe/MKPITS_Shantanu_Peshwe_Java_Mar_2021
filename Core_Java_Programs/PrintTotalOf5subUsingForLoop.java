//Accept 5 subject marks and print total using for loop
import java.util.*;

public class PrintTotalOf5subUsingForLoop {
    public static void main(String[] args) {
        int sub,total=0,cnt;
        Scanner sc=new Scanner(System.in);

        for(cnt=1;cnt<=5;cnt++)
        {
            System.out.println("Enter the marks in subject : ");
            sub=sc.nextInt();
            total=total+sub;
        }
        System.out.println("Total marks of 5 subjects : "+total+" / 500");
    }
}
