package java8.lamda;
@FunctionalInterface
interface inter{
    public int a(int a,int b);

}
public class lamda {
    public static void main(String[] args) {
        inter a= (s,b)-> s+b;
        int m=a.a(4,34);
        System.out.println(m);
    }
}
