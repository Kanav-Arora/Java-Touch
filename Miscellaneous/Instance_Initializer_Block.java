package Miscellaneous;

/*
    Each time when a new instance is created, before the execution of constructor Initializer block is executed

*/

class Call {
    {
        // Initializer Block - 1
        System.out.println("IIB1");
    }
    {
        // Initializer Block - 2
        System.out.println("IIB2");
    }

    Call() {
        // Constructor - 1
        System.out.println("In non-parameterized constructor");
    }

    {
        // Initializer Block - 3
        System.out.println("IIB3");
    }

    Call(int x) {
        // Constructor - 2
        System.out.println("In the constructor-2");
    }

}

public class Instance_Initializer_Block {
    public static void main(String[] args) {
        Call c1 = new Call();
        Call c2 = new Call(5);
    }
}
