class Student1{
    //private data member
    private float roi;
    //getter method for name
    /*
    public String getName()
    {
    return name;
    }
    */
    //setter method for name

    public void setName(float roi){
        this.roi=roi;
    }

    public float calinterest(float pa,int nom) {
        float pi=pa * roi * nom;
        return pi;
    }
}

//A Java class to test the encapsulated class.
class Test1
{
    public static void main(String[] args)
    {
        //creating instance of the encapsulated class
        Student1 s=new Student1();
        //setting value in the name member
        s.setName(12.3f);
        float res=s.calinterest(20000,12);
        //getting value of the name member
        // System.out.println(s.getName());
        System.out.println("simple interest " + res);
    }
}
