//check whether the entered number is natural number or not
import java.util.*;

public class CheckEnteredNumberIsnaturalNumber {
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        num=sc.nextInt();

        if(num>0) {
            System.out.println("Entered number is natural number");
        }
        else {
            System.out.println("Entered number is not a natural number");
        }
    }
}
