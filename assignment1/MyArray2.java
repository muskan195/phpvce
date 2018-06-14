           //__________multiplication of two matrices_________
 
import java.util.Scanner;   
 public class MyArray2
{
   public static void main(String args[])
   {
      int m, n, p, q,k,sum=0;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of first matrix");
      m = in.nextInt();
      n = in.nextInt();
 
      int first[][] = new int[m][n];
 
      System.out.print("Enter the elements of first matrix");
 
      for(int i=0; i<m; i++)
        {
         for (int j=0; j<n; j++)
          {
            first[i][j] = in.nextInt();
        
          }
        }
      System.out.print("Enter the number of rows and columns of second matrix");
      p = in.nextInt();
      q = in.nextInt();
 
         int second[][] = new int[p][q];
       int multiply[][] = new int[m][q];
       
       System.out.print("Enter the elements of second matrix");
 
         for (int i=0 ; i<p; i++ )
         {
            for (int j=0; j<q ; j++ )
          {  
             second[i][j] = in.nextInt();
              
             }
         }
 
         for (int i=0; i<m; i++)
         {
            for (int j=0 ; j<q; j++ )
            {              
                 for ( k=0 ; k<p; k++ )
                  {
                   sum=sum + first[i][k] * second[k][j];
               }
             multiply[i][j] = sum;
             sum = 0;
            }
         }
 
         System.out.println("Product of entered matrices:-");
 
         for (int i=0; i<m; i++)
         {
            for (int j=0 ; j<q; j++ )
            { 
               System.out.print(multiply[j][i]+"\t");
            }
             System.out.print("\t\t\t\n");
         }
      }
  
  }