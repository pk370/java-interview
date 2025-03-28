package Stringstringbufferstringbuilder;
//Strings are immutable in java
public class StringDemo {
    public static void main(String[] args) {
        String s1=new String("hello");//It will create two objects. One in heap with reference s1 and another in scp(String
                                             //--constant pool;
        String s2=new String("hello");
        String s3="hello";//first it will check whether the same object is there in the scp or not.If there then it will use that
                          //object.If not then it will create another object only in scp.
        String s4="hello";
        System.out.println(s1==s2);//false. because if we use new keyword, it will create new object everytime. "==" checks only the
                                   //--the reference.
        System.out.println(s1==s3);//false, because one in heap and another one in scp.
        System.out.println(s2==s3);//false;
        System.out.println(s3==s4);//true.
        System.out.println(s1.equals(s2));//true. In string class the equals method is override the equals method in object class.
                                         //-- In object class the equals method is meant for reference comparision. But in String
                                         //--class it is for content comparison.
        String a1=new String("hii");
        a1.concat("hello");//only hello will be created in scp, hiihello will be created in heap, because the objects created
                              //--created at runtime will not be presented in scp.
        char c[] ={'p','a','v','a','n'};
        String h=new String(c);
        System.out.println(h);//It will take char array as input in the constructor.
        byte b[]={97,65,69,98};
        String h1=new String(b);
        System.out.println(h1);
        String w=new String("java");
        String e=w.concat("");//If there is no change in the content while trying to modify, then the reference will show
                                  //the same object.
        System.out.println(w==e);
    }
}
