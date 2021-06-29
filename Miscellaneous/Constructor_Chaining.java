package Miscellaneous;

/*
    Constructor chaining within a same class can be done with overloaded constructors. And chaining of constructors can be done using this() keyword.
    Here object instance will call the parameterized constructor --> TestFile(String name, int age)
    first line, this(name) will call the constructor --> TestFile(String name)
    So the chaining will end at default constructor

    Note: constructor declaration doesn't matter, you can declare constructor in any order.
*/


class TestFile{
    TestFile()
    {
        System.out.println("Default Constructor");
    }
    TestFile(String name){
        this();
        System.out.println("Name:" + name);
    }
    TestFile(String name, int age){
        this(name);
        System.out.println("Name:" + name + " Age:" + age);
    }
    public static void main(String[] args) {
        TestFile t = new TestFile("Kanav",15);
    }
}