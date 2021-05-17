package prelim.overload;

public class Average {
    public double getAverage(int x, int y){
        return (double)(x+y)/2;
    }
    public double getAverage(int x, int y, int z){
        return (double)(x+y+z)/3;
    }
    public double getAverage(double x, double y){
        return x+y/2;
    }
    public double getAverage(double x, double y, double z){
        return x+y+z/3;
    }
}

