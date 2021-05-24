//Let's see the simple example of StringTokenizer class that tokenizes a string "my name is khan" on the basis of (,).

import java.util.StringTokenizer;
public class StringTokenIOEx2 {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("my,name,is,shantanu",",");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
