//Example of 2d array
import java.util.*;

public class ExampleOf2dArray {
    public static void main(String[] args){
        int a,b;
        String name[][]={{"Aman","Raju","Shan"},{"Shruti","Savi","Monika"}};

        for(a=0;a<2;a++){
            for(b=0;b<3;b++){
                System.out.print("\t"+name[a][b]);
            }
            System.out.println();
        }
    }
}
