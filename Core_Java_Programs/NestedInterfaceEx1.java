//example of nested interface

interface printable6{
    void print();
    interface MessagePrintable{
        void msg();
    }
}

class example6 implements printable6.MessagePrintable {
    public void print() {
        System.out.println("print");
    }

    public void msg() {
        System.out.println("msg");
    }
}

class defmeth {
    public static void main(String[] arg) {
        example6 e=new example6();
        e.msg();
        e.print();
    }
}