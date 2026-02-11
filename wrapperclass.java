import java.util.Scanner;

class wrapperclass{
     public static void main(String[] args) {
   Scanner scn=new Scanner(System.in);
    int a=10;
    Integer b=a;    //Autoboxing
   
    Integer c=10;
    int d=c;
    System.out.println("The value of a is variable: "+a);
    System.out.println("The value of b is wrapper class: "+b);
    System.out.println("The value of c is wrapper class: "+c);
    System.out.println("The value of d is variable: "+d);
    }
}

