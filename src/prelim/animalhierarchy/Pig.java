package prelim.animalhierarchy;

public class Pig extends Animal{
    public Pig(String name, int age){
        super(name, age, "pig");
    }

    public void speak(){
        System.out.println("Oink! Oink!\n");
    }
}