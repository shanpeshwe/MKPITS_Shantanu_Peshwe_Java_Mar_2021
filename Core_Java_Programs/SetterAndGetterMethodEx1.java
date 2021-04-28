class Student2 {
    private  int age;
    public void setage(int age) {
        if( age <= 100) {
            this.age=age;
        }
        else {
            System.out.println("age is greater than 100");
        }
    }
    public  int getage() {
        return  age;
    }
}
class en1 {
    public static void main(String[] args) {
        Student2 s1=new Student2();
        //s1.age=333;
        s1.setage(910);
        System.out.println("age is " + s1.getage());
    }
}
