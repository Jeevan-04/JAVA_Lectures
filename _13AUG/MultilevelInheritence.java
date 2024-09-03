package _13AUG;
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class BabyDog extends Dog{
    void weep(){System.out.println("Weeping...");}
}
public class MultilevelInheritence {
    public static void main(String[] args) {
    BabyDog d=new BabyDog();
    d.weep();
    d.bark();
    d.eat();
    }
}
