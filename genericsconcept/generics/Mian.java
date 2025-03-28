package genericsconcept.generics;

import java.util.ArrayList;

public class Mian {
    public static void main(String[] args) {
        ArrayList<Student> s=new ArrayList<>();
        s.add(new Student(1,"pk1"));
        s.add(new Student(2,"pk2"));
        s.add(new Student(3,"pk3"));
        s.add(new Student(4,"pk4"));
        s.add(new Student(5,"pk5"));
        for(Student d:s){
            System.out.println(d);
        }
    }
}
