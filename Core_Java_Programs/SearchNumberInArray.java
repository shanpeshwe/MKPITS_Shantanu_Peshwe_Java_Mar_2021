//wap to store 5 no. in an array .
//then accept a no. from the user and search this number in an array.(search an element in an array)
import java.util.*;

public class SearchNumberInArray {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        int usernum,cnt;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to be searched from 1 to 5 : ");
        usernum=sc.nextInt();

        for(cnt=0;cnt<5;cnt++) {
            if(num[cnt]==usernum) {
                System.out.println("num "+cnt+" = "+num[cnt]);
                break;
            }
        }
        if(cnt==5) {
            System.out.println("Number is not found in array");
        }
    }
}
