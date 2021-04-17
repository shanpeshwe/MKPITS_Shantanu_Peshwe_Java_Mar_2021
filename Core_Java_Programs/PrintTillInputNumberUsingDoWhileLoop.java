//print till inputed number using do while loop

import java.util.Scanner;

public class PrintTillInputNumberUsingDoWhileLoop {
    public static void main(String[] args){
        int num, cnt=1;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number : ");
        num=sc.nextInt();
        do {
            System.out.print(cnt+"\t");
            cnt++;
        } while (cnt <= num);
    }
}
