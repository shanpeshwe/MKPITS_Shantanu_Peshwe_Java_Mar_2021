//wap to create array 10 elements accept 10 no. from the user and store it in an array//
//then accept a no. from the user to search in an array.(linear search)
import java.util.*;

public class SearchNumberInArrayUsingLinearSearch {
    public static void main(String[] args)
    {
        int num[]=new int[10];
        int cnt,nts;
        Scanner sc=new Scanner(System.in);

        for(cnt=0;cnt<10;cnt++)
        {
            System.out.println("Enter any number : ");
            num[cnt]=sc.nextInt();
        }
        System.out.println("Enter number to search : ");
        nts=sc.nextInt();

        for(cnt=0;cnt<10;cnt++)
        {
            if(num[cnt]==nts)
            {
                System.out.println("Number "+nts+" is at position : "+cnt);
                break;
            }
            if(cnt==9)
            {
                System.out.println("Number is not in the array");
            }
        }
    }
}
