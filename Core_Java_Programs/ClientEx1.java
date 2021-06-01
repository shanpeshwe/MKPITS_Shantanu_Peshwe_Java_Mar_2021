import java.io.DataOutputStream;
import java.net.Socket;

public class ClientEx1 {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("Localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e){
        System.out.println(e);
        }
    }
}
