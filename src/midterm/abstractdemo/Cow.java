package midterm.abstractdemo;

public class Cow extends Animal{
    public Cow(String name, int age, String animalType){
        super(name, age, animalType);
    }

    public void speak(){
        System.out.println("Mooo!\n");
    }
}