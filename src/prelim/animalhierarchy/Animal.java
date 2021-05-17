package prelim.animalhierarchy;

public class Animal{

    private String name;
    private int age;
    private String animalType;
    static int count = 0;

    public Animal(){
        this.name = "Animal name";
        this.age = 0;
        this.animalType = "animal";
        count++;
    }

    public Animal(String name, int age, String animalType){
        this.name = name;
        this.age = age;
        this.animalType = animalType;
        count++;
    }

    public String toString(){
        return name + " is a " + age + "-year-old " + animalType;
    }

    public void speak(){
        System.out.println("Animal sound...\n");
    }

    public static void getAnimalCount(){
        System.out.println("There are " + count + " animals in the farm.");
    };

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void sleep(){
        System.out.println(name + " is sleeping...");
    }
}