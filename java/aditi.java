import java.util.Scanner;
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
}