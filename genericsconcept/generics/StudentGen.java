package genericsconcept.generics;

public class StudentGen<Student1> {
    String[] arr;
    StudentGen(){
        arr=new String[5];
    }
}
class Student1{
    private int id;
    private String name;

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class test3{
    public static void main(String[] args) {
        StudentGen<Student1> s1=new StudentGen<>();

    }
}
