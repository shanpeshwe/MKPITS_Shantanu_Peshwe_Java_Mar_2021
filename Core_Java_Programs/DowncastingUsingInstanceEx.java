//downcasting using instance of a class

class person1 {
}

class customer1 extends  person1 {
    static void downmethod(person1 p) {
        if(p instanceof  customer1) {
            customer1 c = (customer1) p;
            System.out.println("downcasting performed");
        }
        else {
            System.out.println( "downcasting not possible");
        }
    }
}

class example1 {
    public static void main(String[] args) {
        person1 p=new customer1();
        customer1.downmethod(p);
    }
}
