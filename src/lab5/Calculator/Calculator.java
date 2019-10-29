package lab5.Calculator;

public class Calculator {
    public void sum(int x, int y){
        System.out.println(x+y);
    }
    public void sum(int x, int y, int z){
        System.out.println(x+y+z);
    }
    public void sum(double x, int y){
        System.out.println((int)x+y);
    }
    public void sum(int x, double y){
        System.out.println(x+y);
    }
    public void min(int x, int y){
        System.out.println(x-y);
    }
    public void min(int x, float y, int z){
        System.out.println(x-y-z);
    }
    public void min(int x, int y, int z, int a){
        System.out.println(x-y-z-a);
    }
    public void min(float x, float y, int z){
        System.out.println(x-y-z);
    }
    public int mult( int x, int y){
        return x*y;
    }
    public void mult(int x, float y){
        System.out.println(x*y);
    }
    public void mult(float x, int y, float z){
        System.out.println(x*y*z);
    }
    public void mult(int x, double y){
        System.out.println(x*y);
    }
    public void div(int x, int y){
        System.out.println(x/y);
    }
    public void div(float x, float y){
        System.out.println(x/y);
    }
    public void div(int x, int y, int z){
        System.out.println(x/y/z);
    }
    public void div(int x, float y, float z){
        System.out.println(x/y/z);
    }
}
