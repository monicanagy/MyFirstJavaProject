package lab1;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world");

        //Tipuri de date
        //String brand = "Zara";
       // String colour = "Verde";
        //byte size = 34;
        //int beautyLevel = 123484848;
       //long utilityLevel = 111111111147372737L;
        //double satisfactionLevel = 11111111111112636747577552d;

        printMyName();
        op1();
        op2();
        op3();
        op4();
        sum();
        min();
        mult();
        div();

        printImage();


        //Operatii matematice
        // +, -, /, *, =, ==

       // int x = 15;
        //int y = 10;
        //int sum = x + y;
        //float average = sum/5f;

        //System.out.println(sum);
        //System.out.println(average);

        //double g = 42;
        //System.out.println(g/2);

        //float a = -5+8*6f;
        //System.out.println(a);

        //int b = (55+9) % 9;
        //System.out.println(b);

        //int c = 20 + -3*5 / 8;
        //System.out.println(c);

        //float d = 5 + 15 / 3 * 2 - 8 % 3f;
        //System.out.println(d);

        //Tema metode
        //1. Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru
        //   fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main()
    }
    public static void printMyName(){
        System.out.println("Hello\nMonica");
    }
    public static void op1(){
        int a= -5+8*6;
        System.out.println(a);
    }
    public static void op2(){
        int b= (55+9)%9;
        System.out.println(b);
    }
    public static void op3(){
        int c= 20+-3*5/8;
        System.out.println(c);
    }
    public static void op4(){
        int d= 5+15/3*2-8%3;
        System.out.println(d);
    }
    //2. Scrieti cate o metoda java pentru fiecare din urmatoarele operatii matematice:
    //   adunare, scadere, inmultire, impartire.

    public static void sum(){
        int x= 6;
        int y= 7;
        int sum = x+y;
        System.out.println(sum);
    }
    public static void min(){
        int x= 10;
        int y= 4;
        int min=x-y;
        System.out.println(min);
    }
    public static void mult(){
        int x= 7;
        int y= 3;
        int mult=x*y;
        System.out.println(mult);
    }
    public static void div(){
        int x= 42;
        int y= 7;
        int div= x/y;
        System.out.println(div);
    }
    //3. Scrieti o metoda java, care sa afiseze urmatorul model:
    public static void printImage(){
                System.out.println( "j    a  v      v   a");
                System.out.println( "j   a  a  v   v   a a");
             System.out.println("j   j   aaaaa  v v   aaaaa");
         System.out.println(     "jj    a     a  v   a     a");
    }
}
