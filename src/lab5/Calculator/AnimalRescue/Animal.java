package lab5.Calculator.AnimalRescue;

import org.w3c.dom.ls.LSOutput;

public class Animal {
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
    public void animalFood(){
        System.out.println("The animal eats");
    }

}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog makes woof");
    }
    public void animalFood(){
        System.out.println("The dog eats bones ");
    }

}
class Cat extends Animal{
    public void animalSound(){
        System.out.println("The cat makes meow");
    }
    public void animalFood(){
        System.out.println("The cat eats milk");
    }
}
class Cow extends Animal{
    public void animalSound(){
        System.out.println("The cow makes moo");
    }
    public void animalFood(){
        System.out.println("The cow eats grass");
    }
}
class Donkey extends Animal{
    public void animalSound(){
        System.out.println("The donkey makes hee-haw");
    }
    public void animalFood(){
        System.out.println("The donkey eats carrots");
    }
}
class Horse extends Animal{
    public void animalSound(){
        System.out.println("The horse makes neigh");
    }
    public void animalFood(){
        System.out.println("The horse eats hay");
    }
}
class Sheep extends Animal{
    public void animalSound(){
        System.out.println("The sheep makes baa");
    }
    public void animalFood(){
        System.out.println("The sheep eats grass");
    }
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig makes oink");
    }
    public void animalFood(){
        System.out.println("The pig eats pumpkins");
    }
}
class Chicken extends Animal{
    public void animalSound(){
        System.out.println("The chicken makes cluck");
    }
    public void animalFood(){
        System.out.println("The chicken eats grain");
    }
}
class Duck extends Animal{
    public void animalSound(){
        System.out.println("The duck makes quack");
    }
    public void animalFood(){
        System.out.println("The duck eats grain");
    }
}
class Frog extends Animal{
    public void animalSound(){
        System.out.println("The frog makes ribbit");
    }
    public void animalFood(){
        System.out.println("The frog eats insects");
    }
}
