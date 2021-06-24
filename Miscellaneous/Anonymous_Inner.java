package Miscellaneous;

/*
    Anonymous inner class can be created using an interface.

*/

interface Standard{
    int x = 0;
    void getStandard();
}

class Test{
    public static void main(String[] args) {
        Standard s = new Standard(){
       
            @Override
            public void getStandard() {
                System.out.println("Standard: "+ x);
            }
        };
        
        s.getStandard();
    }
    
}