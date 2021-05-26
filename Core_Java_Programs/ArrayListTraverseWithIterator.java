//program on Traversing list through Iterator

import java.util.ArrayList;
import  java.util.*;

public class ArrayListTraverseWithIterator {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++) {
            System.out.println("enter student name : ");
            String sn=sc.next();
            s.add(sn);
        }

        //System.out.println(stud);
        Iterator itr=s.iterator();
        while (itr.hasNext()) {
            System.out.println("student name : " + itr.next());
        }


    }
}
