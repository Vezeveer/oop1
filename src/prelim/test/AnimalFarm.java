package prelim.test;
import prelim.animalhierarchy.Animal;
import prelim.animalhierarchy.Cat;
import prelim.animalhierarchy.Cow;
import prelim.animalhierarchy.Dog;
import prelim.animalhierarchy.Pig;

public class AnimalFarm{
    public static void main(String[] args){
        Animal generic = new Animal();
        System.out.println(generic);
        generic.speak();

        Cat felix = new Cat("Felix", 5);
        System.out.println(felix);
        felix.speak();

        Dog charlie = new Dog("Charlie", 4);
        System.out.println(charlie);
        charlie.speak();

        Pig babe = new Pig("Babe", 2);
        System.out.println(babe);
        babe.speak();

        Cow lucy = new Cow("Lucy", 10);
        System.out.println(lucy);
        lucy.speak();

        Animal.getAnimalCount();
    }
}