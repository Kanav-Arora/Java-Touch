class Class1 {
    int standard;
    String section;
    public Class1(int standard, String section)
    {
        this.standard = standard;
        this.section = section;
    }
    
    public String print()
    {
        return (standard + "-"+ section);
    }
}

class Student extends Class1{
    String name;

    Student(int standard, String section ,String name)
    {   
        // calling the constructor of the base class to assign values to base class members
        super(standard, section);
        this.name = name;
    }

    // overriding the print method of base class
    @Override
    public String print()
    {
        return (name + " of " + standard + "-"+ section);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // in inheritance there is no need to create an object of base class
        Student s = new Student(12,"A","Kanav");
        System.out.println(s.print());
    }    
}
