package lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Cat mita = new Cat();
        mita.name= "Mita";

        System.out.println(mita.color);
        System.out.println(mita.age);
        System.out.println(mita.miaow());
        System.out.println(mita.health);
        System.out.println(mita.hunger);
        System.out.println(mita.mood);

        Dog mura = new Dog();
        mura.name= "Mura";
        System.out.println(mura.color);
        System.out.println(mura.age);
        System.out.println(mura.barking());
        System.out.println(mura.health);
        System.out.println(mura.hunger);
        System.out.println(mura.mood);

        Adopter monica= new Adopter();
        monica.name= "Monica";
        System.out.println(monica.name);
        System.out.println(monica.moneyRonAvailable);

        AnimalFood royalcanin= new AnimalFood();
        royalcanin.name= "RoyalCanin";
        System.out.println(royalcanin.name);
        System.out.println(royalcanin.PriceRon);
        System.out.println(royalcanin.AmountKg);
        System.out.println(royalcanin.AvailabilityInStock);

        RecreationalActivity playingWithTheBall= new RecreationalActivity();
        playingWithTheBall.name= "Playing with the Ball";
        System.out.println(playingWithTheBall.name);

        Veterinarian raluca= new Veterinarian();
        raluca.name= "Raluca";
        System.out.println(raluca.name);
        System.out.println(raluca.specialization);












    }
}
