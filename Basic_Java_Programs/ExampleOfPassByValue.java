//example of pass by value

public class ExampleOfPassByValue {
    public static void changevalue(int num)
    {
        num=num+5;
        System.out.println("Updated value : "+num);
    }

    public static void main(String[] args)
    {
        int num=5;
        System.out.println("Value before function : "+num);
        changevalue(num);
        System.out.println("Value after function : "+num);
    }
}
