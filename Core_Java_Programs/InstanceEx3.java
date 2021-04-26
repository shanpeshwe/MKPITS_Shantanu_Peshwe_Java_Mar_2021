//instance example with null value

class person {
}
class customer extends  person {
    String name;
}

class example {
    public static void main(String[] args) {
        customer c=null;//null value is not an instance fo output will be false
        boolean b= c instanceof  person;
        System.out.println(b);
        if(b==true){
            System.out.println("code to be processed");
        }
    }
}