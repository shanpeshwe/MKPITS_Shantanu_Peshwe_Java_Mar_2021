//example of this to call method

public class ExampleOfThis {
    static class calculate {
        void caltotal(int a, int b, int c) {
            int tot = a + b + c;
            System.out.println("total " + tot);
            this.calaverage(tot);
        }

        void calaverage(int t) {
            float av = (float) t / 3;
            System.out.println("average " + av);
        }
    }

    static class calex {
        public static void main(String[] args) {
            calculate c = new calculate();
            c.caltotal(1, 2, 3);

        }

    }
}