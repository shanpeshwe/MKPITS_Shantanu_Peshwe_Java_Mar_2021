//Add two distances in inch-feet by creating a class named 'AddDistance'.

import java.util.*;

//class Distance to read, print and add distance
class Distance
{
    int feet;
    int inches;

    public void getDistance()
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter feet: ");
        feet=sc.nextInt();
        System.out.print("Enter inches: ");
        inches=sc.nextInt();
    }
    public void showDistance()
    {
        System.out.println("Feet: "+ this.feet + "\tInches: "+ this.inches);
    }

    public void addDistance(Distance D1, Distance D2)
    {
        this.inches=D1.inches+D2.inches;
        this.feet=D1.feet+D2.feet+(inches/12);
        this.inches=inches%12;
    }
}

class AddTwoDistance
{
    public static void main(String []s) {
        Distance D1=new Distance();
        Distance D2=new Distance();
        Distance D3=new Distance();

        //read first distance
        System.out.println("Enter first distance: ");
        D1.getDistance();

        //read second distance
        System.out.println("Enter second distance: ");
        D2.getDistance();

        //add distances
        D3.addDistance(D1,D2);
        //print distance
        System.out.println("Total distance is:" );
        D3.showDistance();
    }
}