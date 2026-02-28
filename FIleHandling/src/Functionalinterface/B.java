package Functionalinterface;

public class B {
    public static void main(String[] args) {
        A a = new A(){
            @Override
            public void m1(){
                System.out.println("Overriding m1, in class B");

            }
        };

        a.m1();
    }

}


