//Same example by annonymous class that extends Thread class:
//Program of performing two tasks by two threads



public class MultiTaskMutiThreadEx2 {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                System.out.println("task one...");
            }
        };
        Thread t2=new Thread(){
            public void run(){
                System.out.println("task two...");
            }
        };
        t1.start();
        t2.start();
    }
}
