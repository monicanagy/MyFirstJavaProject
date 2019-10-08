package lab2;

public class Main {

    public static void main(String[] args) {
        int a=2;
        int b=3;
        int result=sum(a,b);
        System.out.println("Rezultatul adunarii este:"+result);
        float res=min(a,b);
        System.out.println("Rezultatul scaderii este:"+res);





















    }

    public static int sum(int first, int second) {
        int result=first+second;
        return result;
    }
    public static float min(float first,float second){
        float result=first-second;
        return result;
    }


}








