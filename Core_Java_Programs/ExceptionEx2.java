//use finally block to execute important codes. this block is always executed


public class ExceptionEx2{
    public static void main(String args[]){

        int n1=10;
        int n2=5;
        int res=0;
        try {
            res=n1/n2;
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("finally res = " + res);
        }
    }
}
