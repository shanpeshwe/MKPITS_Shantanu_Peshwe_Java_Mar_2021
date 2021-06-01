//continuous communication with ClientEx2

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(1111);
            Socket s=ss.accept();
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            DataInputStream din=new DataInputStream(s.getInputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String str1="",str2="";
            while(!str1.equals("stop")){
                str1=din.readUTF();
                System.out.println("Client says : "+str1);
                str2=br.readLine();
                dout.writeUTF(str2);
                dout.flush();
            }
            din.close();
            s.close();
            ss.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
