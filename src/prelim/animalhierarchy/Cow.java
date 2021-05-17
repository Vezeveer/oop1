package prelim.animalhierarchy;

public class Cow extends Animal{
    public Cow(String name, int age){
        super(name, age, "cow");
    }

    public void speak(){
        System.out.println("Mooo!\n");
    }
}