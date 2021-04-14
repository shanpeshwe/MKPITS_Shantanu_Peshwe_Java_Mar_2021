//Call by value example

public class CallByValueExample {
    static  int num;
    public static void changevalue(int num)
    {
        num=num+100;
        System.out.println("value of  num inside method " + num);//600
    }
    public static void main(String[] arg)
    {
        num=500;
        changevalue(num);
        System.out.println("value of  num after calling method " + num);//500
    }

}
