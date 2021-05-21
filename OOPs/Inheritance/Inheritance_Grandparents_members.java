package OOPs.Inheritance;

class Grandparent{
    public void print() {
        System.out.println("At the grandparent level");
    }
}

class Parent extends Grandparent{
    // here override won't make a difference
    @Override
    public void print() {
        super.print();
        System.out.println("At the parent level");
    }
}

class Child extends Parent{
    @Override
    public void print(){
        super.print();
        System.out.println("At the child level");
    }
}

public class Inheritance_Grandparents_members {
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
    }    
}
