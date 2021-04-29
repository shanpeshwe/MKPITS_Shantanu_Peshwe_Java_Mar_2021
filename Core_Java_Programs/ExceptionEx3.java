//exception in string

public class ExceptionEx3 {
    public static void main(String[] args) {
              int arr[]=new int[5];
              int res=0;
              try{
                  arr[6]=33;
              }catch(Exception e){
                  System.out.println(e.toString());
              }
              finally {
                  System.out.println(res);
              }
              System.out.println("Bye");
    }
}
