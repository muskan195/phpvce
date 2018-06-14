/^public class junglee
   { 
    static void Array(int arr1[],int arr2[])
    {
 int [] arr1 = {1,2,2,2,2,2,2,3,6,6,6,6,6,6,};
    int [] arr2 = {7,5,3,6,6,2,2,3,6,6,6,6,6,6,6,6,};

    Arrays.sort(arr1);
    Arrays.sort(arr2);
    ArrayList result = new ArrayList<>();
    int i =0 ;
    int j =0;
    while(i< arr1.length && j<arr2.length){
    if (arr1[i]>arr2[j])
      {
        j++;
      }
 else if (arr1[i]<arr2[j])
      {
        i++;
      }
       else 
       {
        result.add(arr1[i]);
        i++;
        j++;
    }
   
    System.out.println(result);
}
public static void main(String args[])
{
 Array (int arr1[],int arr2[])
}
}*/






import java.util.Scanner;
 
class UnionOfArrays
{
    public static void main(String...s) {
        int i,j,n1,n2;
        Scanner sc=new Scanner(System.in); //used to read from keyboard
        
        System.out.print("Enter number of elements of first array:");
        n1=sc.nextInt();
        System.out.print("Enter number of elements of second array:");
        n2=sc.nextInt();
        
        int a1[]=new int[n1];
        int a2[]=new int[n2];
        
        System.out.print("\nEnter elements of first array in ascending order:");
        for(i=0;i<n1;++i)
            a1[i]=sc.nextInt();
        
        System.out.print("\nEnter elements of second array in ascending order:");
        for(i=0;i<n2;++i)
            a2[i]=sc.nextInt();
    
        i=j=0;
        System.out.print("\nUnion of Arrays: ");
        while(i<n1&&j<n2)
        {
            if(a1[i]<a2[j])
            {
                System.out.print(a1[i]+" ");
                i++;
            }
            else
                if(a2[j]<a1[i])
                {
                    System.out.print(a2[j]+" ");
                    j++;
                }
                else
                {
                    System.out.print(a1[i]+" ");
                    i++;
                    j++;
                }
        }
        
        if(i<n1)
            while(i<n1)
            {
                System.out.print(a1[i]+" ");
                i++;
            }
        
        if(j<n2)
            while(j<n2)
            {
                System.out.print(a2[j]+" ");
                j++;
            }
    }
}
