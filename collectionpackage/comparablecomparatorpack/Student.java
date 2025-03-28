package collectionpackage.comparablecomparatorpack;

import java.util.*;

public class Student implements Comparable<Student>{
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

    @Override
    public int compareTo(Student o) {
        int i=this.age-o.age;
        int j=this.rollNo-o.rollNo;
        return i==0?j:i;
    }

}
    class test2{
        public static void main(String[] args) {
              List<Student> students=new ArrayList<>();
            students.add(new Student(6,"pavan",22));
            students.add(new Student(5,"pavan",39));
            students.add(new Student(4,"pavan",42));
            students.add(new Student(3,"fayaz",55));
            students.add(new Student(1,"onak",61));
            Collections.sort(students);
            System.out.println(students);
            //If we do not want the default natural sorting order then we should use comparator.
            Comparator<Student>c=new Comparator<Student>() {//this is the comparator for roll number.
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getRollNo()-o2.getRollNo();
                }
            };
            Collections.sort(students,c);
            System.out.println("based on rollno: "+students);
            Collections.sort(students,((o1, o2) -> o1.getName().compareTo(o2.getName())));
            System.out.println("based on names and used lambda expression"+students);

        }
    }

