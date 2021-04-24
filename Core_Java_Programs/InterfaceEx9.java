// Default Method in Interface

interface Drawable4{
    void draw();
    default void msg(){
        System.out.println("default method");
    }
}

class Rectangle4 implements Drawable4{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}

class TestInterfaceDefault{
    public static void main(String args[]){
        Drawable4 d=new Rectangle4();
        d.draw();
        d.msg();
    }
}