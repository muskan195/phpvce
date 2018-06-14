             //__________MATRIX ALL SUM__________-


public class MyArray5
{
 public static void main(String... a)
  {
   int [][] num={{20,30,45,34},
                  {14,45,67,89},  
                  {25,47,87,45},         
                  {65,76,98,95}};
           matrixallsum(num);
   }

                             //____________rows sum__________
          
  public static void matrixallsum(int a[][])
  {
   int sum=0;

  int rowsize=a.length;
   int coulmnsize=a.length;
   System.out.println("rows" + rowsize);     
  
     for(int i=0; i<4; i++)              
      {
       for(int j=0; j<4; j++)
        {
         System.out.print(a[i][j]+ " ");
         sum=sum+a[i][j];
         }
         System.out.print("=");
     System.out.println(" " +sum);
       
      sum=0;
      }         
                                //  ___________coulmn sum_________

    System.out.println("cols" + coulmnsize);     
      
      for(int j=0; j<4; j++)
      {
       for(int i=0; i<4; i++)
       {
        System.out.print(a[i][j]+ " ");
        sum=sum +a[i][j];
       }
        System.out.print("=");
     System.out.println(" " +sum);
      sum=0;
     }

                              //_______________diagonaly sum_________

    int sumOfDiagonal1=0;
     
    for(int i=0; i<4; i++)
      {
       for(int j=0; j<4; j++)
       {
         if(i==j)
         System.out.print(a[i][j]+ "\t");
        sumOfDiagonal1=sumOfDiagonal1 + a[i][j];
        }
       }
    System.out.print("=");
     System.out.println(" " + sumOfDiagonal1);
}}

                 
