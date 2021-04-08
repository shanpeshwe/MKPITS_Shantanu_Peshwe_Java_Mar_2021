//example of float array
import java.util.*;

public class ExampleOfFloatArray {
    public static void main(String[] args){
        int a;
        float num[]=new float[5];
        Scanner sc=new Scanner(System.in);

        for(a=0;a<5;a++){
            System.out.println("Enter any float number : ");
            num[a]=sc.nextFloat();
        }
        for(a=0;a<5;a++){
            System.out.println("Number is : "+num[a]);
        }
    }
}
