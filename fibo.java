public class fibo{
    public static void main(String [] args) {
        
        int a = 0;
        int b = 1;
        int c;
        int n = Integer.parseInt(args[0]);
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(n>0){
            c= a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            n--;
        }

    }
}
