             //_________find max in i-d_____     

/*import java.util.Scanner;       
public  class MyArray
{
  public static void main(String args[])
  {
   int n,max;
   Scanner s=new Scanner(System.in);
    System.out.println("enter number of elements in array"); 
    n=s.nextInt();
    int a[]=new int[n];
    System.out.println("Enter elements in array");
    for(int i=0; i<a.length; i++)
    {
      a[i]=s.nextInt();
     }
       max=a[0];
    for(int i=0; i<a.length; i++)
       {
         if(max>a[i])
           {
             max=a[i];
            }
       }
     System.out.print("maximum value-->" +max);
  }
}*/


               //__________find min in i-d________ 




/*import java.util.Scanner;            
public  class MyArray
{
  public static void main(String args[])
  {
   int n,min;
   Scanner s=new Scanner(System.in);
    System.out.println("enter number of elements in array"); 
    n=s.nextInt();
    int a[]=new int[n];
    System.out.println("Enter elements in array");
    for(int i=0; i<a.length; i++)
    {
      a[i]=s.nextInt();
     }
       min=a[0];
    for(int i=0; i<a.length; i++)
       {
         if(min>a[i])
           {
             min=a[i];
            }
       }
     System.out.print("mainimum value-->" +min);
  }
}*/



             //_______find max value in 2-d array_______

/*import java.util.Scanner;   
public class MyArray
{
 public static void main(String args[])
 {
  int n,max;
  int m;
   Scanner s=new Scanner(System.in);
  
System.out.println("Enter the no of elements");
 n=s.nextInt();
   m=s.nextInt();
   int a[][]=new int[3][3];
System.out.println("enter the elements in array");
for(int i=0; i<3; i++)
{
 for(int j=0; j<3; j++)
  { 
a[i][j]=s.nextInt();
}
}
   max=a[0][0];
    for(int i=0; i<3; i++)
       {
        for(int j=0; j<3; j++)
         {
         if(max<a[i][j])
           {
             max=a[i][j];
            }
       }
}
     System.out.print("maximum value-->" +max);
  }
}*/



              //_________find min value in 2-d array__________



/*import java.util.Scanner;
public class MyArray
{
 public static void main(String args[])
 {
  int n,min;
  int m;
   Scanner s=new Scanner(System.in);
  
System.out.println("Enter the no of elements");
 n=s.nextInt();
   m=s.nextInt();
   int a[][]=new int[3][3];
System.out.println("enter the elements in array");
for(int i=0; i<3; i++)
{
 for(int j=0; j<3; j++)
  { 
a[i][j]=s.nextInt();
}
}
   min=a[0][0];
    for(int i=0; i<3; i++)
       {
        for(int j=0; j<3; j++)
         {
         if(min>a[i][j])
           {
             min=a[i][j];
            }
       }
}
     System.out.print("minimum value-->" +min);
  }
}*/


       //__________multiplication of two matrices_________
 
/*import java.util.Scanner;   
 public class MyArray
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
  
  }*/

                //__________MATRIX ALL SUM__________-


public class MyArray
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
   int sum=0,i,j;

  int rowsize=a.length;
   int coulmnsize=a.length;
  System.out.println("rows" + rowsize);     
  
     for(i=0; i<4; i++)              
      {
       for(j=0; j<4; j++)
        {
         System.out.print(a[i][j]+  " ");
         sum=sum+a[i][j];
         }
         System.out.print("=");
     System.out.println(" " +sum);
     
       sum=0;
      }       
                                //  ___________coulmn sum_________

    System.out.println("\n\ncols" + coulmnsize);     
      
      for(j=0; j<4; j++)
      {
       for(i=0; i<4; i++)
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
     System.out.print("\n\n");
    for(i=0; i<4; i++)
      {
       for(j=0; j<4; j++)
       {
         if(i==j)
         System.out.print(a[i][j]+ "\n");
        sumOfDiagonal1=sumOfDiagonal1 + a[i][j];
        }
      for(j=0; j<=i; j++)
       System.out.print("  ");
       }
       
    System.out.print("=");
     System.out.println("\t\n\t" + sumOfDiagonal1);
   }
}

                              //_____find minimum value in upper triangle B________

/*public class MyArray
{
 static void triangleBmin(int x[][])
  {
   int min=0;                    
   for(int i=0; i<3; i++)
    {
    for(int j=0; j<3; j++)
     {
      min=x[0][0];
      if(i<=j)
       {
        if(x[i][j]<min)
         {
            min=x[i][j];
         }
       }
      }  
  }
System.out.println("the minimum value of upper triangle B is:" + min);

}
public static void main(String args[])
{ 
  triangleBmin(new int[][]
                  {{1,2,3},
                   {4,5,6},
                   {7,8,9}});
       }
}*/


                      //______find maximum value in upper triangle B_____


/*public class MyArray
{
 static void triangleBmax(int x[][])
  {
   int max=0;                  
   for(int i=0; i<3; i++)
    {
    for(int j=0; j<3; j++)
     {
      max=x[0][0];
      if(i<=j)
       {
        if(x[i][j]>max)
         {
            max=x[i][j];
         }
       }
      }  
  }
System.out.println("the maximum value of upper triangle B is:" + max);
}
public static void main(String args[])
{ 
 triangleBmax(new int[][]
                  {{1,2,3},
                   {4,5,6},
                   {7,8,9}});
    }
 }*/



                             //_________find minimum value in lower triangle A________


/*public class MyArray
{
 static void triangleAmin(int x[][])
 {
  int min=0;
  for(int i=0; i<3; i++)
   {
    for(int j=0; j<3; j++)
     {
       min=x[0][0];
       if(j<=i)
        {
         if(x[i][j]<min)
          { 
             min=x[i][j];
           }
          }
        }
       }
   System.out.println("the minimum value of lower triangl A is" + min);
   }
 public static void main(String args[])
  {
   triangleAmin(new int[][]
                   {{1,2,3},
                    {4,5,6},
                    {7,8,9}});
     }
}*/

          
                    //__________find maximum value in lower triangle A______________



/*public class MyArray
{
 static void triangleBmax(int x[][])
  {
   int max=0;                  
   for(int i=0; i<3; i++)
    {
    for(int j=0; j<3; j++)
     {
      max=x[0][0];
      if(i<=j)
       {
        if(x[i][j]>max)
         {
            max=x[i][j];
         }
       }
      }  
  }
System.out.println("the maximum value of upper triangle B is:" + max);
}
public static void main(String args[])
{ 
 triangleBmax(new int[][]
                  {{1,2,3},
                   {4,5,6},
                   {7,8,9}});
    }
 }*/


       
                            //________find sum of upper matrices B______ 



/*public class MyArray
{
 static void triangleBsum(int x[][])
  {
   int sum=0;
   for(int i=0; i<3; i++)
    {
     for(int j=0; j<3; j++)
     {
       if(i<j)
       {
         
       sum =sum + x[i][j];
      }
   }
  }

System.out.println("sum of upper triangle matrices is-->" + sum);
}
public static void main(String args[])
{
 triangleBsum(new int[][]
                {{1,2,3},
                 {4,5,6},
                 {7,8,9}});
}
}*/


                               //________find sum of lower A tringlular matrix______


/*public class MyArray
{
 static void triangleAsum(int x[][])
  {
   int sum=0;
   for(int i=0; i<3; i++)
    {
     for(int j=0; j<3; j++)
     {
       if(i>j)
       {
       sum =sum + x[i][j];
      }
   }
 }

System.out.println("sum of lower triangle matrices is-->" + sum);
}
public static void main(String args[])
{
 triangleAsum(new int[][]
                {{1,2,3},
                 {4,5,6},
                 {7,8,9}});
}
}*/

                                     //_______sorting values--__________


/*public class MyArray
 {
  public static void main(String args[])
 {
  int i ;
  int array[] = {13,9,4,99,120,1,3,10};
  
  System.out.println("before sorting values are:");
  for( i=0; i<array.length; i++)
  {
   System.out.print(array[i]+ " ");
 bubblesort(array, array.length);
   }
  System.out.println("\n\nafter sorting values--:\n");
 
  for(i = 0; i <array.length; i++)
  {
   System.out.print(array[i]+"  ");
  }

    }

 public static void bubblesort( int a[], int n )
  {
  int i, j,t=0;
  for(i = 0; i < n; i++)
  {
  for(j = 1; j < (n-i); j++)
   {
  if(a[j-1] > a[j])
   {
  t = a[j-1];
  a[j-1]=a[j];
  a[j]=t;
  }
  }
  }
  }
}*/



        //__________________________MERGE SORT___________________________




/*import java.util.Scanner;
public class aditi 
{
    public static void main(String[] args) 
    {
        int n,m, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of elements of first array:");
        n = s.nextInt();
        int a[] = new int[n];
	System.out.println("enter no. of elements of second array");
	m=s.nextInt();
	int b[]=new int[m];
        System.out.println("Enter all the elements of first array");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
	System.out.println("enter all the elements of second array");
	for(int i = 0; i<m;i++)
	{
	    b[i]=s.nextInt();
	}
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("first sorted array:");
        for (int i = 0; i < n ; i++) 
        {
            System.out.println(a[i] + ",");
        }
	for(int i=0;i<m;i++)
	{
	   for(int j=i+1;j<m;j++)
	{
	    if(b[i]>b[j])
	{
	    temp=b[i];
	    b[i]=b[j];
	    b[j]=temp;
	 }
	}
       }  
	
       //System.out.print("\n");
	System.out.println("second sorted array:");
	for(int i=0;i<m;i++)
	{
	System.out.println(b[i] + " ");
        }   
	int c[] = new int[a.length + b.length];
	int i=0,j=0,k=0;
	while(i<a.length && j<b.length)
	{
	if(a[i]<b[j])
	{
	c[k]=a[i];
	i++;
	}
	else
	{
	c[k]=b[j];
	j++;
	}
	k++;
	}
       while(i<a.length)
         {
           c[k]=a[i];
           i++;
           k++;

          }
        while(j<b.length)
           {
           c[k]=b[j];
           j++;
           k++;
          }
            
            System.out.println("merge sorted array is:");
	 for(k=0; k<m+n; k++)
           {
	 System.out.println(c[k] + " ");     
      }
    }
}*/
