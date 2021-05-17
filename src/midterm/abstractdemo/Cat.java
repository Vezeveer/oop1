package midterm.abstractdemo;

public class Cat extends Animal{
    public Cat(String name, int age, String animalType){
        super(name, age, animalType);
    }

    public void speak(){
        System.out.println("Meow!\n");
    }

}