package lab4.Calculator;

public class LogicalOp {
    public void printToHundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }
    public float getAverageFromNumber(){
        float sum= 0;
        int x= 111;
        int count= 0;
        while(x<=8899){
            sum= sum+ x;
            x++;
            count++;
    }
        return(sum/count);
    }
    public void printToHundredFromSeventeen(int number1){
        for (int i= number1; i<= 100; i++){
            System.out.print(i + ",");
        }

    }
    public void printToMinusHundred(int number2){
        for(int i= number2; i<=-100; i++){
            System.out.print(i + ",");
        }
    }
    public void printFromXtoY(){
        int x= 2;
        int y= 5;
        for( int i= x; i<=y; i++){
            System.out.println(i);
    }

    }
    public void printFromAtoB(){
        int a= 10;
        int b= 7;
        for( int i= a; i>b; i++){
            System.out.println(i);
        }
    }
}










