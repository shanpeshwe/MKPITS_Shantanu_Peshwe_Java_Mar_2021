public class MultiTaskMutiThreadEx4 {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                for (int i=0;i<=10;i++){
                    System.out.println("task one : =" + i);
                }
            }
        };
        Thread t2=new Thread(){
            public void run(){
                for (int i=100;i>=90;i--){
                    System.out.println("task two : =" +i);
                }
            }
        };
        t1.start();
        t2.start();//thread starts randomly as per the allotment
    }
}
