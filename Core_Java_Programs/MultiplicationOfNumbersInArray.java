//wap to create  a array of 5 element then multiply the elements of array and then display it.
import java.util.*;

public class MultiplicationOfNumbersInArray {
    public static void main(String[] args)
    {
        int[] num={1,2,3,4,5};
        int cnt,mul=1;
        for(cnt=0;cnt<5;cnt++)
        {
            mul=num[cnt]*mul;
        }
        System.out.println("Multiplication of all numbers in array : "+mul);
    }
}
