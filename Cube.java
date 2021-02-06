import java.lang.*;
class Cube{
    public static void main(String [] args){
        int n= Integer.parseInt(args[0]);
        double cube = Math.pow(n, 3);
        System.out.println("Cube is"+cube);
    }
}