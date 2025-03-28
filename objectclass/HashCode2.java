package objectclass;
//hashCode methode is presents in the object class.
//It is a native method and return a unique value based on the address of the object.
//we can override if we want our own unique number for our object;
public class HashCode2 {
    public static void main(String[] args) {
        HashCode2 hashCode2=new HashCode2();
        System.out.println(hashCode2.hashCode());
        String i=Integer.toHexString(hashCode2.hashCode());
        System.out.println(i);
        System.out.println(hashCode2.toString());//Here it will take the toString method of object class and that method takes
                                                 //the hashcode method from this class not from the object class.
    }
    public int hashCode(){
        return 789;
    }
}
