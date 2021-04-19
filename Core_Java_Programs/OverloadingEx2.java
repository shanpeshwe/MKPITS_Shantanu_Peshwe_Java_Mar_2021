//In this example, we have created two methods that differs in data type.
// The first add method receives two integer arguments and second add method receives two double arguments.

class Add{
    static int add (int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
}

public class OverloadingEx2 {
    public static void main(String[] args) {
        System.out.println(Add.add(1,2));
        System.out.println(Add.add(1.1,2.2));
    }
}