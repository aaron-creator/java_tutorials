import java.lang.*;
class GCD{
    public static void main(String []args){
        int gcd=0;;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        for(int i = 1; i <= a && i <= b; i++){
            if(a%i==0 && b%i==0){
                gcd = i; 
            }
        }
        System.out.print("GCD is "+gcd);
    }
}