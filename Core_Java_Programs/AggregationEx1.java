//in this example, we have created the reference of Operation class in the Circle class.

class Operation {
    int square(int n) {
        return n * n;
    }
}

public class AggregationEx1 {
    Operation op;
    double pi=3.142;
    double area(int radius){
        op=new Operation();
        int rsquare=op.square(radius);//code reusablity (i.e. delegates the method call).
        return pi*rsquare;
    }
    public static void main(String[] args) {
        AggregationEx1 c1=new AggregationEx1();
        double result = c1.area(5);
        System.out.println("Area of Circle : "+result);
    }
}