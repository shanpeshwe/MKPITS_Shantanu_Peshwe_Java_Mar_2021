//example of java throws clause which describes that checked exceptions can be propagated by throws keyword.
import java.io.IOException;

public class ThrowsKeywordEx1 {
    void m()throws IOException{
        throw new IOException("device error");//checked exception
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("exception handled");
        }
    }
    public static void main(String args[]){
        ThrowsKeywordEx1 obj=new ThrowsKeywordEx1();
        obj.p();
        System.out.println("normal flow...");
    }
}
