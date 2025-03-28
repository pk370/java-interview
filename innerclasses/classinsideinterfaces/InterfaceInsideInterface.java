package innerclasses.classinsideinterfaces;

interface InterfaceInsideInterface {
    static abstract strictfp interface abc{
        int a=7980;
    }
}
class testInterfaceInsideInterface{
    int k=InterfaceInsideInterface.abc.a;
}
