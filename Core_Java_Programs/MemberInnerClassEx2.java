class student2 {
    private int rno=22;
    class address {
        public void showdata() {
            System.out.println("rno " + rno);
        }
    }
}

class testinner2 {
    public static void main(String[] arg) {
        student2 s=new student2();
        student2.address sa=s.new address();
        sa.showdata();
    }
}
