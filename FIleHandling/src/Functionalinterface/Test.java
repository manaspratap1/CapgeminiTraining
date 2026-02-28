package Functionalinterface;

class Parent{
    public void m1(int[] arr){
        System.out.println("Array arg method");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Parent();

        p.m1(null);
    }
}
