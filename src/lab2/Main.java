package lab2;

public class Main {

    public static void main(String[] args) {


        int x = 3;
        int y = 5;
        float result = sum(x, y);
        System.out.println(result);
        result=min(x,y);
        System.out.println(result);
        result=div(x,y);
        System.out.println(result);
        result=mult(x,y);
        System.out.println(result);





    }





    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }
    public static float min(float first, float second) {
        float min = first - second;
        return min;
    }
    public static float div(float first, float second){
        float div= first/second;
        return div;
    }
    public static int mult(int first, int second){
        int mult= first*second;
        return mult;
    }

}







