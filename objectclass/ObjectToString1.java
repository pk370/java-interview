package objectclass;
//Object class is the root class of all classes in java.
//Every class in java extends Object class in directly or indirectly.
//Object class has toString method which returns the string representation of 'classname@someNumber'.
//toString method uses hashcode method which is again method in object class to get that someNumber. Ha
//If we do not want this type of representation of object then we can override this method and we can implement in the way we want.
public class ObjectToString1 {
    int i=90;
    int j=34;
    public static void main(String[] args) {
        ObjectToString1 objectToString1=new ObjectToString1();
        System.out.println(objectToString1);
        System.out.println(objectToString1.toString());//both 11 and 12 are same. Both will call the toString method.
 //      if we do not override we may get the output like below
//        objectclass.ObjectToString1@4dd8dc3
//        objectclass.ObjectToString1@4dd8dc3
// If we override we get the output that has been implemented in the override method like below.
//i=90 j=34
//i=90 j=34
    }
    public String toString(){
        return "i="+i+" j="+j;
    }
}
