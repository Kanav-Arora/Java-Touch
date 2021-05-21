package OOPs.Polymorphism;

public class Method_Overloading {
    
    public int val(int a)
    {
        return a;
    }
    
    public int val(int a, int b)
    {
        return (a+b);
    }

    public int val(int a,int b, int c)
    {
        return (a+b+c);
    }

    public static void main(String[] args) {
        Method_Overloading m = new Method_Overloading();
        System.out.println(m.val(3));
        System.out.println(m.val(3,4));
        System.out.println(m.val(3,4,5));
    }

}
