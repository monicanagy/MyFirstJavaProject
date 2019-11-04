package lab6.AnimalRescue;

public abstract class Dog extends Animal{


    @Override
    public void sleep() {
        System.out.println("Hrmmmm");

    }

    @Override
    public void eat() {
        System.out.println("Eats bones");

    }

    @Override
    public void walk() {
        System.out.println("On all fours");

    }

    @Override
    public void play() {
        System.out.println("With the ball");

    }
}
