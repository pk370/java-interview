package innerclasses.classinsideinterfaces;

public class classInsideInterface {
    static abstract strictfp interface ajd{
        int k=98;
    }

    public static void main(String[] args) {
        int m=classInsideInterface.ajd.k;
    }
}
class m{
    public static void main(String[] args) {
        int m1=classInsideInterface.ajd.k;
    }
}
