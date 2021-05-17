package midterm.abstractdemo;

public class Horse extends Animal {
    public Horse(String name, int age, String animalType){
        super(name, age, animalType);
    }
    public void speak(){
        System.out.println("Whinny!\n");
    }
}
