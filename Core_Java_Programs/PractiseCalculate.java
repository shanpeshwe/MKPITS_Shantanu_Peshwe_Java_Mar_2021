import java.util.Scanner;

public class PractiseCalculate {


    public void Addition(float a,float b){

    float res=(float)a+b;
    System.out.println("Addition from 1 is : "+res);
    }

    public void Addition(int a,int b){
    int res=a+b;
    System.out.println("Addition from 2 is : "+res);
    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number 1 :");
        a=sc.nextInt();
        System.out.println("Enter number 2 :");
        b=sc.nextInt();

        PractiseCalculate cal=new PractiseCalculate();

        float c=1.1f;
        float d=2.2f;

        cal.Addition(c,d);
        cal.Addition(a,b);
    }
}
