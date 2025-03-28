package genericsconcept.generics;

public class genDemo<T> {
    public static void main(String[] args) {
        sum<Integer> k=new sum<>();
        for(int i=0;i<5;i++){
            k.var[i]=i*2;
        }
        System.out.println(k.toString());
        sum<String> m=new sum<>();
        for(int i=0;i<5;i++){
            k.var[i]=""+i;
        }
        System.out.println(k.toString());
        sum<Student> s=new sum<>();
        for(int i=0;i<5;i++){
            s.var[i]=new Student(i,"pavan"+i);
        }
        System.out.println(s.toString());
        System.out.println(new Student(6,"so;difi"));


    }

}
