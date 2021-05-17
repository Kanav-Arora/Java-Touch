public class Encapsulation {
    private String name;
    private int age;
    private int standard;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getStandard() {
        return standard;
    }
    public void setStandard(int standard) {
        this.standard = standard;
    }
}

class Tests{
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setName("Kanav");
        e.setAge(19);
        e.setStandard(11);

        System.out.println(e.getName());
        System.out.println(e.getAge());
        System.out.println(e.getStandard());
    }
}
