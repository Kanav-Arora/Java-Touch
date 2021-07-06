package Miscellaneous;

class Singleton {
    public static Singleton single_instance  = null;
    public static String s = "Singleton Class";
    public static Singleton Singleton(){
        if(single_instance==null)
            single_instance = new Singleton();
        return single_instance;
    }
}

class Run{
    public static void main(String[] args) {
        Singleton x = Singleton.Singleton();
        Singleton y = Singleton.Singleton();
        Singleton z = Singleton.Singleton();
        System.out.println(x.s);
        System.out.println(y.s);
        System.out.println(z.s);

        z.s = "Singleton class variable changed";
        System.out.println(x.s);
        System.out.println(y.s);
        System.out.println(z.s);
    }
}


