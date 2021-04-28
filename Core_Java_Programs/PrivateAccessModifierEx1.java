//example of private access modifier

class person {
    private String name;
    public void getname(String name) {
        this.name=name;
    }
    public void displayname() {
        System.out.println("name is " + name);
    }
}
class amex1 {
    public static void main(String[] args) {
        person p=new person();
        // p.name="amit"; error
        p.getname("amit");
        p.displayname();
    }
}
