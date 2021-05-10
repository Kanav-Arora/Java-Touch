/*
    Use of wrapper to swap the reference of two objects and then accesing the members

*/




class Student{
    String name; int age;
    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void print()
    {
        System.out.println(name + ", "+ age);
    }
}

class StudentWrapper{
    Student s;
    StudentWrapper(Student s)
    {
        this.s = s;
    }
}



public class SwapObjects {

    public static void swap(StudentWrapper sw1, StudentWrapper sw2)
    {
        Student s = sw1.s;
        sw1.s = sw2.s;
        sw2.s = s;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Kanav",19);
        Student s2 = new Student("Shivam",20);

        StudentWrapper sw1 = new StudentWrapper(s1);
        StudentWrapper sw2 = new StudentWrapper(s2);

        swap(sw1,sw2);

        sw1.s.print();
        sw2.s.print();



    }
}
