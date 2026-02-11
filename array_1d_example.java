class Array1DPrint{
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};

        for(int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
    }
}

class Array1DElement{
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};
        int max=0;

        for(int num:numbers) {
            if(num > max) {
                max=num;
            }
        }
        System.out.println("max:"+max);
    }
}

class array1{
    public static void main(String[] args) {
        int num=10;

        if(num>0) {
            System.out.println("positive");
        }
        else if(num<0) {
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
}


class array2{
    public static void main(String[] args) {
        int a=24;
        int b=8;
        int c=3;
        if(a>b && a>c){
            System.out.println("a is largest");
        }else if(b>c){
            System.out.println("b is largest");
        }else{
            System.out.println("c is largest");
        }
    }
}

class array3{
    public static void main(String[] args) {
        char ch='a';
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("vowel");
            break;
            default:
                System.out.println("consonant");
        }
    }
}
    
class main{
    public static void main(String[] args) {
        int[] numbers ={10,20,30,40};
        System.out.println(numbers[0]);  
    }
}


class arraysd{
    public static void main(String[] args) {
        int[][] numbers ={{10,20,30},{40,50,60}};
        System.out.println(numbers[0][0]);  
    }
}