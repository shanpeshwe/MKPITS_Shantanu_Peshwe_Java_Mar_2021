//create  a parent class person having field name and address , create a derived class student
//inherited from person class having additional fields rno and marks.


class person
    {
        String name;
        String address;
    }
    //creating a derieved class student
class student extends  person
    {
        int rno;
        int marks;
    }

    public class InheritanceEx1 {
        public static void main(String[] args) {
            student s=new student();
            s.rno=111;
            s.name="amit";
            s.address="nagpur";
            s.marks=789;
            System.out.println(s.rno + " : " + s.name + " : " + s.address +" : "+ s.marks);
        }
    }