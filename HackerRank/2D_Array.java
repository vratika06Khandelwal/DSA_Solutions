// https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
      //arr.toArray();
         int sumArray[][] ;
         int k= 3 , n = arr.size();
         int temp[][] = new int[n-k+1][n-k+1] ;
         int max = Integer.MIN_VALUE;
               for (int i = 0 ; i<= n-k; i++)
               {
                 for (int j = 0 ; j<= n-k; j++)
               {   
                   
                   int sum =0;
                   for (int a = 0 ; a<k; a++)
               {
                   for (int b = 0 ; b<k; b++)
               {
                   if(a==1 && b==0 || a==1 && b==2)
                   {
                       sum = sum+0;
                        //System.out.print(arr.get(a+i).get(b+j));
                   }
                   else
                   {   
                      // System.out.print(arr.get(a+i).get(b+j));
                       sum = sum + arr.get(a+i).get(b+j);
                   }
               }
              // System.out.println("");
               
               }
               temp[i][j] = sum;
               if(temp[i][j]>=max)
               {
                   max= temp[i][j];
               }
               }  
               }
               
               for(int i =0 ; i<=n-k ;i++)
               {
               for(int j =0 ;j<= n-k ;j++)
               {
                  System.out.print(temp[i][j]+" "); 
               }
               System.out.println("");
               }
               
               
         return max;
    }

}
