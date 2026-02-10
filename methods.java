import java.util.Scanner;

class Example1{
    void hello() {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Example1 obj=new Example1();
        obj.hello();
    }
}



class Example2{
    void add(int a,int b) {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Example2 obj=new Example2();
        obj.add(10,20);
    }
}


class example5{
    static void staticMethod() {
        System.out.println("i am static");
    }
    void instanceMethod() {
        System.out.println("i am instance");
    }
     
    public static void main(String[] args) {
        staticMethod();  

        example5 obj=new example5();
        obj.instanceMethod();
    }
}


class example6 {
    void greet(String name) {
        System.out.println("Hello "+ name);  
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter name");
        String name = scn.nextLine();

        example6 obj=new example6();
        obj.greet(name);
    }
    
}