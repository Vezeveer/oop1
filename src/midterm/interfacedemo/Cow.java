package midterm.interfacedemo;
import midterm.abstractdemo.Animal;

public class Cow extends Animal implements AnimalInterface{
    public Cow(String name, int age, String animalType){
        super(name, age, animalType);
    }

    public void speak(){
        System.out.println("Mooo!");
    }

    public void drink(String drink){
        System.out.println(super.getName() + " is drinking " + drink);
    }

    public void eat(String food){
        System.out.println(super.getName() + " is eating " + food);
    }

    public void sleep(){
        System.out.println(super.getName() + " is sleeping...");
    }
}