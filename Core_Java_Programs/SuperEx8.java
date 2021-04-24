//Here, Emp class inherits Person class so all the properties of Person will be inherited to Emp by default.
// To initialize all the property,we are using parent class constructor from child class.
// In such way, we are reusing the parent class constructor.

class Person8{
    int id;
    String name;
    Person8(int id,String name) {
        this.id=id;
        this.name=name;
    }
}

class Emp8 extends Person8{
    float salary;
    Emp8(int id,String name,float salary){
        super(id,name);//reusing parent constructor
        this.salary=salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}

class SuperEx8{
    public static void main(String[] args){
        Emp8 e1=new Emp8(1,"ankit",45000f);
        e1.display();
    }
}