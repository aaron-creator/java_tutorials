class Largestofnos{
    public static void main(String []args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c =Integer.parseInt(args[2]);
        /*
        if(a>b)
            System.out.print(a+" is the largest");
        else
            System.out.print(b+" is the largest");
        */
        if(a>b && a>c)
            System.out.print(a+" is the largest");
        else if(b>a && b>c)
            System.out.print(b+" is the largest");
        else 
            System.out.print(c+"is the largest");    
    }
}