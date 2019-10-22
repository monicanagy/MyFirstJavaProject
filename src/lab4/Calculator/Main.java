package lab4.Calculator;

import org.w3c.dom.ls.LSOutput;

public class Main<number> {

    public static void main(String[]args) {
        //Given number, while the number is equal to or lower than 100, print the number
        //int number = 2;
        //for (int i = number; i <= 100; i++) {
            //System.out.println(i);

        // FOR
        // Write a java program to count backwards from a given number to a lower given number

        // Write a program called sumAndAverage to produce the sum of 1, 2, 3, ..., to 100.Also compute and disp// the average
        // WHILE
        // Write a program to sum only the odd numbers from 1 to 100, and compute the average.

        // Write a program to sum those numbers from 1 to 100 that is divisible by 7, and compute the average.
        // Modify the program to sum from 111 to 8899, and compute the average. Introduce an int variable called count
        //to count the numbers in the specified range

        // Modify the program to sum from 111 to 8899, and compute the average. Introduce
        //an int variable called count to count the numbers in the specified range.
        //float sum = 0;
        //int x = 111;
       // int count = 0;
        //while (x <= 8899) {
            //sum = sum + x;
           // x++;
            //count++;
           // System.out.println(sum);
            //System.out.println(sum / count);



        // Tema Java for Loops
        // 1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numrul
        // primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
        // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
        //int number1 = 17;
        // for(int i= number1; i<=100; i++){
        // System.out.print(i + ",");

        // 2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
        // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul
        // primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
        int number2 = -110;
        for (int i = number2; i <= -100; i++) {
            System.out.print(i + ",");
        }
        // 3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
        // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
        //pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
        // numaratoarea sa se faca de la x, la y.
        int x= 2;
        int y= 5;
        for( int i= x; i<=y; i++) {
            System.out.println(i);
        }

        // 4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
        // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare
        // crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel
        // de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
        int a= 10;
        int b= 7;
        for( int i= a; i>b; i++){
            System.out.println(i);
        }

    }
}











