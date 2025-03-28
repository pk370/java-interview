package genericsconcept.genericsdemo2;

public class Main {
    public static void main(String[] args) {
//        printer<Integer>k=new printer<>(5);
//        k.print();
//        printer<Double> k1=new printer<>(5.0);
//        k1.print();
//        printer<Integer> k2=new printer<>(9,"fs");
//        ArrayList<Cat>cats=new ArrayList<Cat>();
//        Cat<Dog> m=new Cat<>(new Dog("chimtu"));
//        Cat<Donkey>dokeyCat=new Cat<Donkey>(new Donkey("donkey"));
//        System.out.println(m.animal.name);
//        System.out.println(dokeyCat.animal.name);
        Animal<Lion>o1=new Animal<>(new Lion("lion"));
        o1.animal.showAnimal();
        Animal<Donkey>o2=new Animal<>(new Donkey("donkey"));
        o2.animal.showAnimal();
        o2.animal.showAnimal2();
        Animal<Dog>o3=new Animal<>(new Dog("dog"));
        o3.animal.showAnimal();
        o3.animal.showAnimal1();



    }
}
