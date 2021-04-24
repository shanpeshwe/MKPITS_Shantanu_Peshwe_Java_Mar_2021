//example of initializer block

class A2{
    int n=0;
    A2(){
        System.out.println("parent class constructor invoked");
    }
}

class B4 extends A2{
    B4(){
        super();
        System.out.println("child class constructor invoked");
        System.out.println("n=" + n);
    }

    B4(int a){
        super();
        System.out.println("child class constructor invoked "+a);
        System.out.println("n=" + n);
    }

    {System.out.println("instance initializer block is invoked");
        n=n+1;
    }

    public static void main(String args[]){
        B4 b1=new B4();
        B4 b2=new B4(10);
    }
}