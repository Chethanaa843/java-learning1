class Ifexample{
    public static void main(String[] args) {
        int age=18;

        if (age>=18) {
            System.out.println("You are an adult");
        }
    }
}

class IfElseexample {
    public static void main(String[] args) {
        int number=7;

        if(number% 2==0) {
            System.out.println(number+"is even");
        }else{
            System.out.println(number+"is odd");
        }
    }
}

class GradeExample{
    public static void main(String[] args) {
        int marks=85;

        if(marks>=90) {
            System.out.println("Grade: A");
        }else if(marks>=80) {
            System.out.println("Grade: B");
        }else if(marks>=70) {
            System.out.println("Grade: C");
        }else if(marks>=60) {
            System.out.println("Grade: D");
        }else {
            System.out.println("Grade: F");
        }
     }    
}

class logicalOperationExample{
    public static void main(String[] args) {
        int age=25;
        boolean hasTicket=true;

        //And operator
        if(age>=18 && hasTicket) {
            System.out.println("You can enter the movie");
        }

        //OR operator
        boolean isWeekend=true;
        boolean isHoliday=false;

        if(isWeekend || isHoliday) {
            System.out.println("You can relax:");
        }

        //Not operator
        boolean isRaining=false;

        if(!isRaining) {
            System.out.println("You don't need an umbrella");
        }
    }
}