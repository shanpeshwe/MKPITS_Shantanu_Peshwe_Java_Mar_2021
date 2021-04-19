//example of overloading

class Calc {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static float add(float a, float b) {
        return a + b;
    }
}
public class OverloadingEx3 {
    public static void main(String[] args) {
        System.out.println(Calc.add(1, 2));
        System.out.println(Calc.add(1.12, 2.23));
        System.out.println(Calc.add(1.12345, 2.54321));
    }
}