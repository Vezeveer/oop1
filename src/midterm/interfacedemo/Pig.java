package midterm.interfacedemo;
import midterm.abstractdemo.Animal;

public class Pig extends Animal implements AnimalInterface{
    public Pig(String name, int age, String animalType){
        super(name, age, animalType);
    }

    public void speak(){
        System.out.println("Oink! Oink!");
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