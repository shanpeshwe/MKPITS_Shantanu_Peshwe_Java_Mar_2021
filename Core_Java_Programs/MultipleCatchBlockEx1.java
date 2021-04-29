//Let's see a simple example of java multi-catch block.


public class MultipleCatchBlockEx1 {
    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            a[6] = 30 / 1;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
