//Consider a scenario where Bank is a class that provides a method to get the rate of interest.
// However, the rate of interest may differ according to banks.
// For example, SBI, ICICI, and AXIS banks are providing 8.4%, 7.3%, and 9.7% rate of interest.

class Bank3{
    float getRateOfInterest(){
        return 0;
    }
}
class SBI3 extends Bank3{
    float getRateOfInterest(){
        return 8.4f;
    }
}
class ICICI3 extends Bank3{
    float getRateOfInterest(){
        return 7.3f;
    }
}
class AXIS3 extends Bank3{
    float getRateOfInterest(){
        return 9.7f;
    }
}
public class PolymorphismEx2 {
    public static void main(String args[]){
        Bank3 b;
        b=new SBI3();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b=new ICICI3();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
        b=new AXIS3();
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
    }
}