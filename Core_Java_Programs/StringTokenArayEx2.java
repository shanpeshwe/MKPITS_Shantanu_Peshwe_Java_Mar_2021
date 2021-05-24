//example of stringtokenzer array

import java.util.StringTokenizer;

public class StringTokenArayEx2 {
    public static void main(String[] args) {
        String  str="welcome,to,java,programming...";
        String  arr[]=new String[4];
        StringTokenizer st=new StringTokenizer(str,",");
        int i=0;
        while (st.hasMoreTokens()){
            arr[i]=st.nextToken();
            i=i+1;
        }
        for (i=0;i<4;i++){
            System.out.println(arr[i]);
        }
    }
}
