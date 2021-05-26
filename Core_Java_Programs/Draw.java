import java.awt.*;

class Coordinate{
    public int x,y;

}

interface shape{
    void draw();
}

class circle extends Coordinate implements shape{
    public void draw(){
        x=20;
        y=30;
        System.out.println("Hello from circle-draw : x = "+x+" ;y = "+y);
    }
}

class triangle extends Coordinate implements shape{
    public void draw(){
        x=10;
        y=40;
        System.out.println("Hello from triangle-draw : x = "+x+" ;y = "+y);
    }
}

class test3{
    public static void main(String[] args) {
        shape s1=new circle();
        s1.draw();
        shape s2=new triangle();
        s2.draw();
    }
}
