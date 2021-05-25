package OOPs.Polymorphism;

class Super{
    static void hidden(){
        System.out.println("Static method in Super class");
    }

    public void show(){
        System.out.println("Show method in Super class");
    }
}

class Child extends Super{
    
    static void hidden(){
        System.out.println("Static method in Child class");
    }

    @Override
    public void show(){
        System.out.println("Show method in Child class");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Super s = new Child();
        s.hidden();
        s.show();
    }
}
