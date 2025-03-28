package genericsconcept.generics;

public class Box1 <V1,V2,V3,V4>{
    private V1 v1;
    private V2 v2;
    private V3 v3;
    private V4 v4;

    public Box1(V1 v1, V2 v2, V3 v3, V4 v4) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }

    public V1 getV1() {
        return v1;
    }

    public void setV1(V1 v1) {
        this.v1 = v1;
    }

    public V2 getV2() {
        return v2;
    }

    public void setV2(V2 v2) {
        this.v2 = v2;
    }

    public V3 getV3() {
        return v3;
    }

    public void setV3(V3 v3) {
        this.v3 = v3;
    }

    public V4 getV4() {
        return v4;
    }

    public void setV4(V4 v4) {
        this.v4 = v4;
    }

    @Override
    public String toString() {
        return "Box1{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ", v4=" + v4 +
                '}';
    }
}
class test1{
    public static void main(String[] args) {
        Box1<Integer,Integer,Integer,String>l=new Box1<>(1,2,34,"G");
        Box1<String,String,Integer,Integer>l1=new Box1<>("pavan","kumar",68,5);
        System.out.println(l1);

    }
}
