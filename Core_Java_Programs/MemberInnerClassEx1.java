//example of member inner class

class student1 {
    interface instudent {
        void msg();
    }
    interface instudent1 {
        void msg1();
    }
}

class testinner1 implements student1.instudent,student1.instudent1 {
    public void msg() {
        System.out.println("hello from msg");
    }
    public void msg1() {
        System.out.println("hello from msg1");
    }

    public static void main(String[] arg) {
        student1.instudent ss=new testinner1();
        ss.msg();
        student1.instudent1 ss1=new testinner1();
        ss1.msg1();
    }
}
