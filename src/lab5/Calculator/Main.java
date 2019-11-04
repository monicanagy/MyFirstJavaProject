package lab5.Calculator;
public class Main<myArray> {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(7, 8);
        calculator.sum(42, 7);
        calculator.sum(3, 4, 5);
        calculator.sum(24, 12);
        calculator.min(10, 5);
        calculator.min(10, 3.0f, 4);
        calculator.min(2, 3, 4, 5);
        calculator.min(10.0f, 4.0f, 4);
        calculator.mult(2, 3);
        calculator.mult(10, 2.2f);
        calculator.mult(2.2f, 3, 3.1f);
        calculator.mult(5, 10);
        calculator.div(9, 3);
        calculator.div(12.6f, 2.3f);
        calculator.div(21, 7, 3);
        calculator.div(25, 5.0f, 5.0f);

        //Define and write the values of an array indices, so that the values of the arrays should start from 1 and count
        //to 100.
        LogicalOp op = new LogicalOp();
        int[] newArray = op.getArrayHundred();
        int[] anotherOne = {1, 2, 3, 4, 5};
        float[] x = new float[3];
        x[0] = 1;
        System.out.println(op.averageArray(newArray));

        //3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat
        // cu toate valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza. Atentie,
        // metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.
        int[] myArray = new int[50];
        myArray[0] = 2;
        myArray[1] = 4;


        //5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru
        //de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca
        // da sa returneze true iar daca nu, sa returneze false.  Apelati metoda in main() pentru a verifica daca
        // functioneaza.

        //6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru
        // de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze
        // pozitia pe care se afla numarul.  Apelati metoda in main() pentru a verifica daca functioneaza.

        // 7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array: ----------

        String gridLines[] = {"----------"};
        System.out.println(gridLines[0]);
        System.out.println(gridLines[0]);
        System.out.println(gridLines[0]);
        System.out.println(gridLines[0]);
        System.out.println(gridLines[0]);
        System.out.println(gridLines[0]);
        System.out.println(gridLines[0]);
        System.out.println(gridLines[0]);
        System.out.println(gridLines[0]);
        System.out.println(gridLines[0]);
    }

       // 8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru
        // de tip numar. Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit,
        // fara acel numar. Apelati metoda in main() pentru a verifica daca functioneaza.













}



