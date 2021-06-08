package OOPs.Polymorphism;

class SuperClass{
    // static methods are statically binded
    static void print(){
        System.out.println("Inside the superclass");
    }
}

class SubClass extends SuperClass{
    // static methods are statically binded
    static void print(){
        System.out.println("Inside the subclass");
    }
}

public class Static_Binding{
    public static void main(String[] args) {
        System.out.println("With upcasting: ");
        SuperClass a1 = new SuperClass();
        // static binding is done during compile time, so upcasting won't work.
        SuperClass b1 = new SubClass();
        a1.print();
        b1.print();
        
        System.out.println("With subclass as the reference (without upcasting): ");
        SuperClass a2 = new SuperClass();
        SubClass b2 = new SubClass();
        a2.print();
        b2.print();
    }
}