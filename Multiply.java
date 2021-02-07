class Multiply{
    public static void main(String []args){
        int n = Integer.parseInt(args[0]);
        int p;
        for(int i = n; i<=9; i++){
            for(int j= 1;j<=10;j++){
                p = i * j;
                System.out.println(i+"*"+j+"="+p);
            }
            System.out.println();
        }
    }
}