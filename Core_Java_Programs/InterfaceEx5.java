//In this example, the Drawable interface has only one method. Its implementation is provided by Rectangle
// and Circle classes. In a real scenario, an interface is defined by someone else,
// but its implementation is provided by different implementation providers.
// Moreover, it is used by someone else. The implementation part is hidden by the user who uses the interface.

//Interface declaration: by first user
interface Drawable2{
    void draw();
}

//Implementation: by second user
class Rectangle2 implements Drawable2{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}

class Circle2 implements Drawable2{
    public void draw(){
        System.out.println("drawing circle");
    }
}

//Using interface: by third user
class TestInterface2{
    public static void main(String args[]){
        Drawable2 d=new Circle2();//In real scenario, object is provided by method e.g. getDrawable()
        d.draw();
    }
}