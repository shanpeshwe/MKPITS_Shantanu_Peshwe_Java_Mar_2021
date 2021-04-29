//Example of nextToken(String delim) method of StringTokenizer class

    import java.util.*;

class Test3 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my,name,is,khan");

        // printing next token
        System.out.println("Next token is : " + st.nextToken(","));
    }
}
