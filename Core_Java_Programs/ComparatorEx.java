//Java Program to demonstrate the use of Java Comparator

import java.util.*;
import java.io.*;

class Student1{
    int rollno;
    String name;
    int age;
    Student1(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}

class RollnoComparator implements Comparator<Student1>{
    public int compare(Student1 s1,Student1 s2){
        if(s1.rollno==s2.rollno)
            return 0;
        else if(s1.rollno>s2.rollno)
            return 1;
        else
            return -1;
    }
}

class NameComparator implements Comparator<Student1>{
    public int compare(Student1 s1,Student1 s2){
        return s1.name.compareTo(s2.name);
    }
}

class AgeComparator implements Comparator<Student1>{
    public int compare(Student1 s1,Student1 s2){
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}


public class ComparatorEx {
    public static void main(String args[]){
        //Creating a list of students
        ArrayList<Student1> al=new ArrayList<Student1>();
        al.add(new Student1(101,"Vijay",23));
        al.add(new Student1(106,"Ajay",27));
        al.add(new Student1(105,"Jai",21));

        System.out.println("Sorting by Name");
        //Using NameComparator to sort the elements
        Collections.sort(al,new NameComparator());
        //Traversing the elements of list
        for(Student1 st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("sorting by Age");
        //Using AgeComparator to sort the elements
        Collections.sort(al,new AgeComparator());
        //Travering the list again
        for(Student1 st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("sorting by RollNo");
        //Using AgeComparator to sort the elements
        Collections.sort(al,new RollnoComparator());
        //Travering the list again
        for(Student1 st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
