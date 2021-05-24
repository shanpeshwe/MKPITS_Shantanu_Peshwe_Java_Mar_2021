//Simple Example of garbage collection in java

public class GarbageCollectionEx1 {
    public void finalise(){
        System.out.println("object is garbage collected");
    }

    public static void main(String[] args) {
        GarbageCollectionEx1 t1=new GarbageCollectionEx1();
        GarbageCollectionEx1 t2=new GarbageCollectionEx1();
        t1=null;
        t2=null;
        System.gc();
    }
}
