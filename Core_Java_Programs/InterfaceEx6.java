//Let's see another example of java interface which provides the implementation of Bank interface.

interface Bank1{
    float rateOfInterest();
}

class SBI1 implements Bank1{
    public float rateOfInterest(){
        return 9.15f;
    }
}

class PNB1 implements Bank1{
    public float rateOfInterest(){
        return 9.7f;
    }
}

class TestInterface3{
    public static void main(String[] args){
        Bank1 b=new SBI1();
        System.out.println("ROI: "+b.rateOfInterest());
    }
}