class Print1to100{
    public static void printnumber(int a){
        if(a<=100){
            System.out.print(" "+a);
            printnumber(a+1);
        }
    }
    public static void main(String []args){
        int n = Integer.parseInt(args[0]);
        printnumber(n);
    }
}