class Array{
public static void frequency(int n) {
       //your code here
       int n1 = n;
       int a[] =new int[10];
       for(int i=0;i<10;i++){
           a[i]=0;
       }
       while(n>0){
           int rem = n%10;
           a[rem] = a[rem] +1;
           n=n/10;
       }
       for(int i=0;i<10;i++){
           if(a[i]!=0){
               System.out.println(i+": "+a[i]);
           }
        }
    }
}
