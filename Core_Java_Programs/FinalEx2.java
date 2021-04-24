//If you declare any parameter as final, you cannot change the value of it.

class Bike3 {
    void cube(final int n) {
        int a;
        //n = n + 2; can't be changed as n is final
        a=n*n*n;
        System.out.println(a);
    }

    public static void main(String args[]) {
        Bike3 b = new Bike3();
        b.cube(5);
    }
}