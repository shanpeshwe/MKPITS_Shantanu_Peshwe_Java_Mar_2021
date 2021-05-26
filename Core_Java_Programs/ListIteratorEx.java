
import java.util.*;
public class ListIteratorEx {
    public static void main(String args[]) {
        List<String> l=new ArrayList<String>();
        l.add("Amit");
        l.add("Vijay");
        l.add("Kumar");
        l.add(1,"Sachin");
        ListIterator<String> itr=l.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.nextIndex()+itr.next());
        }
        while(itr.hasPrevious()){
            System.out.println(itr.previousIndex()+itr.previous());
        }
    }
}
