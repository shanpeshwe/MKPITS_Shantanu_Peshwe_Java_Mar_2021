//create an interface shape having method declaration for draw method

interface  shape {
    void draw() ;
}

class circle implements  shape {
    public void draw() {
        System.out.println( "code to  draw circle");
    }
}

class interfaceex1 {
    public static void main(String[] args) {
        shape s=new circle();
        s.draw();
    }
}
