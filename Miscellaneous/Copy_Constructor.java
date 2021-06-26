package Miscellaneous;

class Try{
    private int age;
    private int standard;
    Try(int age, int standard){
        this.age = age;
        this.standard = standard;
    }

    // This is a parameterized constructor
    Try(Try t)
    {
        System.out.println("In copy constructor");
        age = t.age;
        standard = t.standard;
    }

    @Override
    public String toString()
    {
        return "( age = " + age + " class = " + standard + " )";
    }
}
public class Copy_Constructor {
    public static void main(String[] args) {
        Try t1 = new Try(10,20);
        Try t2 = new Try(t1);
        System.out.println(t2);

    }
}
