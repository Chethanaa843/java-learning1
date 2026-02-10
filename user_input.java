import java.lang.System;
import java.util.Scanner;

class user_input_int{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        System.out.println("The value of a is:"+a);
    }
}
 

 class user_input_float{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float f=scn.nextFloat();
        System.out.println("The value of f is:"+f);
    }
}
 
class user_input_String{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String name=scn.nextLine();
        System.out.println("The name is:"+name);
    }
}

class addition_of_two_number{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a=scn.nextInt();
        System.out.println("enter 2nd number:");
        int b=scn.nextInt();
        int sum=a+b;
        System.out.println("The sum of "+a+" and "+b+" is:"+sum);
    }

 }

 class user_input_double{
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    double d=scn.nextDouble();
    System.out.println("The value of d is:"+d);
    }
 }