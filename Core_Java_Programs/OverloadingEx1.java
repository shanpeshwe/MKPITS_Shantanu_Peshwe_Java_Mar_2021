//In this example, we are creating static methods so that we don't need to create
// instance for calling methods.

class Calculate{
    static int add(int n1,int n2){
        return n1+n2;
    }
    static int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}

public class OverloadingEx1 {
    public static void main(String[] args) {
        System.out.println(Calculate.add(1,2));
        System.out.println(Calculate.add(1,2,3));
    }
}
