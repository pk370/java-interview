package collectionpackage.comparablecomparatorpack.comparatorpacka;

import java.util.*;

public class Student {
     private int rollNo;
    private String name;
   private int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class test1{
    public static void main(String[] args) {
        List<Student> stud=new ArrayList<>();
        stud.add(new Student(34,"pavan",22));
        stud.add(new Student(3,"pavan",89));
        stud.add(new Student(4,"pavan",22));
        stud.add(new Student(32,"fayaz",45));
        stud.add(new Student(56,"onak",31));
        //sorting the stud based on the name;

        stud.sort((o1, o2)->o1.getName().compareTo(o2.getName()));
        System.out.println(stud);
        //sorting stud based on the age
        stud.sort((o1,o2)-> o1.getAge()- o2.getAge());
        System.out.println(stud);
        //sorting the studs based on multiple fields
        stud.sort((o1, o2) -> {
            int i=o1.getName().compareTo(o2.getName());
            int j=o1.getAge()- o2.getAge();
            int k= o1.getRollNo()- o2.getRollNo();
            if(k==0){
                return i==0?j:i;
            }
            return k;
        });
        stud.forEach(System.out::println);
        System.out.println("=============================================================");
        //Now sorting the student objects by using method reference

       stud.sort(Comparator.comparing(Student::getName));
        System.out.println(stud);
        stud.sort(Comparator.comparing(Student::getAge));
        System.out.println(stud);
        stud.sort(Comparator.comparing(Student::getRollNo));
        System.out.println(stud);

    }
}
