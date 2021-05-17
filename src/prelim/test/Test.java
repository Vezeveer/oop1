package prelim.test;

import prelim.overload.Average;
import prelim.overload.Print;

public class Test {
    
    public static void main(String[] argz){
        Average avg = new Average();
        System.out.println("\nint,int > "+avg.getAverage(2,2)+
                            "\nint,int,int > "+avg.getAverage(2, 2, 3)+
                            "\ndouble,double > "+avg.getAverage(2.5, 2.7)+
                            "\ndouble,double,double > "+avg.getAverage(1.1, 2.3, 4.9)+
                            "\n"
        );

        Print.printMessage();
        Print.printMessage("Roses are red");
        Print.printMessage("supercalifragilisticexpiladiosus", 5);
    }
}
