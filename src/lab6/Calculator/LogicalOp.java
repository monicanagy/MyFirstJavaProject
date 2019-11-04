package lab6.Calculator;

import java.util.List;

public class LogicalOp {
    //1. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
    // si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void  addToList(List<Integer> list, int number ){
        list.add(number);
    }
    //2. Scrieti o metoda Java, care sa primeasca parametru o Lista si sa afiseze, pe rand, toate valorile din lista,
    //fiecare pe rand nou.
    public void printList(List<Integer> listName) {
        for (int i = 0; i < listName.size(); i++)
            System.out.println(listName.get(i));

        for (int i: listName){
            System.out.println(i);
        }
    }
    //3. Scrieti o metoda Java, care sa primeasca doi parametrii:
    // un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate
    // valorile din lista, fiecare pe rand nou, pornind de la
    // numarul intreg primit ca si parametru.

    public void printFromPosition(List<Integer> myList, int position) {
        for (int i = position; i < myList.size() && i >= 0; i++) {
            System.out.println(myList.get(i));
        }
    }
    //Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,
    // dar invers(de la capat la inceput).

    public void printListFromEndTobegin(List<Integer> listName1){
        for (int i=0; i < listName1.size(); i-- )
            System.out.println(listName1.get(i));

        for (int i: listName1){
            System.out.println(i);
        }

    }






}


