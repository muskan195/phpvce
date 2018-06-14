                  //_____find minimum value in upper triangle B________

public class MyArray6
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


/*public class MyArray6
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


/*public class MyArray6
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



/*public class MyArray6
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



/*public class MyArray6
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


/*public class MyArray6
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


/*public class MyArray6
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


                  
         
