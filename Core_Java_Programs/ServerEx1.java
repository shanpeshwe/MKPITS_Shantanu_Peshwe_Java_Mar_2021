import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx1 {
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();//establishes connection
            DataInputStream din=new DataInputStream(s.getInputStream());
            String  str=(String)din.readUTF();
            System.out.println("message= "+str);
            ss.close();
            din.close();
        }catch(Exception e){System.out.println(e);}
    }

}
