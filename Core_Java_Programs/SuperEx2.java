//example 2 for super keywork

class Animal1 {
    String color="white";
}

class Dog1 extends Animal1 {
    String color="black";
    void printColor() {
        System.out.println(super.color);//prints color of Animal class
    }
}

class BabyDog extends Dog1 {
    String color="brown";
    void printColor1() {
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
        printColor();
    }
}

class TestSuper2 {
    public static void main(String args[]) {
        BabyDog d=new BabyDog();
        d.printColor1();
    }
}