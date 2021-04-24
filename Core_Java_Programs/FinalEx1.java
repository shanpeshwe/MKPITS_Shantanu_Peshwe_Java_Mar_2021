//There is a final variable speedlimit, we are going to change the value of this variable,
// but It can't be changed because final variable once assigned a value can never be changed.

class Bike{
    final int speedlimit;//final variable
    Bike()
    {
        speedlimit=20;//this value is final and cannot be changed
    }
    void run(){
        //speedlimit=400; this statement gives error and cannot be used
        System.out.println(speedlimit);
    }
    public static void main(String args[])
    {
        Bike obj=new Bike();
        obj.run();
    }
}