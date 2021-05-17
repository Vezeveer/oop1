package midterm.interfacedemo;
import midterm.abstractdemo.Animal;

public class Horse extends Animal implements AnimalInterface{
    public Horse(String name, int age, String animalType){
        super(name, age, animalType);
    }
    public void speak(){
        System.out.println("Whinny!");
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
