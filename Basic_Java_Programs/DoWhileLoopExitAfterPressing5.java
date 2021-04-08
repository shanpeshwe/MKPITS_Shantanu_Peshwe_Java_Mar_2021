//do while should exit after pressing 5
import java.util.*;

public class DoWhileLoopExitAfterPressing5 {
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Enter the Number : ");
            num=sc.nextInt();
            System.out.println("Number is : "+num);
        } while (num != 5);

    }
}
