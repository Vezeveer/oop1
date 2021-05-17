package prelim.overload;

public class Print {
    public static void printMessage(){
        System.out.println("Have a nice day!");
    }
    public static void printMessage(String msg){
        System.out.println(msg);
    }
    public static void printMessage(String msg, int n){
        for(int i = 0; i < n; i++){
            System.out.println(msg);
        }
    }
}
