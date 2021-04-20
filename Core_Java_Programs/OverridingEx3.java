//Example of Overriding.

class Bank{
    int getROI(){
        return 0;
    }
}

class SBI extends Bank{
    int getROI(){
        return 8;
    }
}

class ICICI extends Bank{
    int getROI(){
        return 7;
    }
}

class Axis extends Bank{
    int getROI(){
        return 9;
    }
}

class Test{
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        Axis a=new Axis();

        System.out.println("SBI ROI : "+s.getROI());
        System.out.println("ICICI ROI : "+i.getROI());
        System.out.println("Axis ROI : "+a.getROI());
    }
}