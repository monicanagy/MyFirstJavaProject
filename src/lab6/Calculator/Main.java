package lab6.Calculator;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(3);
        myList.add(2);
        myList.add(5);

        myList.remove(Integer.valueOf(3));
        System.out.println(myList.contains(5));
        System.out.println(myList.contains(8));
        System.out.println(myList);

        LogicalOp op = new LogicalOp();
        op.addToList(myList, 4);
        System.out.println(myList.contains(4));


        for (int i = 0; i < myList.size(); i++)
            System.out.println(myList.get(i));

        for (int i : myList) {
            System.out.println(i);

            op.printFromPosition(myList, -4);
        }

        int position = 0;
        for (int i = position; i < myList.size() && i >= 0; i++) {
            System.out.println(myList.get(i));}


    }


}












