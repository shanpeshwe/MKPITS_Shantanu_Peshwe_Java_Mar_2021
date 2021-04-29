class Simple{
    public static void main(String args[]){

        int n1=10;
        int n2=0;
        int res=0;
        try {
            res=n1/n2;
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("res = " + res);
    }
}
