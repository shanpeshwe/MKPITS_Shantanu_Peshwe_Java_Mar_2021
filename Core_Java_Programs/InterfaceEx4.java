//Interface Example

interface shape1 {
    void draw1();
}
class cir1 implements shape1 {
    public void draw1() {
        System.out.println("circle coding");
    }
}

class te {
    public static void main(String[] arg)
    {
        cir1 c=new cir1();
        c.draw1();
    }
}
