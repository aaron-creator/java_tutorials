import java.util.*;
import java.lang.*;

class CI{
    public static void main(String [] args){
        double p = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        int n  = Integer.parseInt(args[2]);
        double c,fc;
        fc = (p * Math.pow((1+r/100),n));
        c = fc-p;
        System.out.println("Future Component Interest is "+fc);
        System.out.println("Component Interest is "+c);
    }
}