package OOPs.Polymorphism;

class A{
    void show()
    {
        System.out.println("A's show method");
    }
}

class B extends A{
    void show(){
        System.out.println("B's show method");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        A a;
        a = new A();
        a.show();
        a = new B();
        a.show();
    }    
}
