class Pattern1{
    public static void main(String [] args)
    {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        System.out.println("row and column"+m+n);
        /*for(int i = 0;i<=n;i++){
            for(int j = 0;j <= i;j++){     //increasing pattern 
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*
        for(int i = n;i>=0;i--){
            for(int j = i;j >= 0;j--){     //decreasing pattern
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /*
          * * * *
          *     *  // box model sample
          *     *
          * * * *
        */

        /*
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        System.out.println("row and column"+m+n);
		for(int i = 1; i <= m; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 || i == m || j == 1 || j == n)
				{
					System.out.print("* "); 
				}
				else
				{
					System.out.print("  "); 
				}
			}
			System.out.print("\n"); 
		}
        */	
    }
}