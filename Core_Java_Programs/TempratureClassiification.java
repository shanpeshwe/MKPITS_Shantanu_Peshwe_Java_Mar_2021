/*Write a program to read temperature in centigrade and display a suitable
message
 according to temperature state below
Temp < 0 then Freezing weather
Temp 0-10 then Very Cold weather
Temp 10-20 then Cold weather
Temp 20-30 then Normal in Temp
Temp 30-40 then Its Hot
Temp >=40 then Its Very Hot */
import java.util.*;

public class TempratureClassiification {
    public static void main(String[] args)
    {
        int t;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the temprature in celcius : ");
        t=sc.nextInt();

        if(t<0)
            System.out.println("Freezing Weather");
        else if(t>=0 && t<10)
            System.out.println("Very Cold Temprature");
        else if(t>=10 && t<20)
            System.out.println("cold Weather");
        else if(t>=20 && t<30)
            System.out.println("Temprature is Normal");
        else if(t>=30 && t<40)
            System.out.println("Its Hot");
        else if(t>=40)
            System.out.println("Its Very Hot");
    }
}