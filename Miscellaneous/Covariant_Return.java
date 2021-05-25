package Miscellaneous;

class A{}

class B extends A{}

class Parent{
    A display(){
        System.out.println("This is Parent class");
        return new A();
    }
}

class Child extends Parent{
    B display(){
        System.out.println("This is Child class");
        return new B();
    }
}
public class Covariant_Return {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.display();
        c.display();
    }
}
