
import java.util.*;
class SCode
{

static int max(int x[])
{
int largest=x[0];
for(int i=1;i<x.length;i++)
{
if(x[i]>largest)
largest=x[i];
}
return largest;
}

//_____________________________________________________________________________________________________________
static int min(int x[])
{
int min=x[0];
for(int i=1;i<x.length;i++)
{
if(x[i]<min)
min=x[i];
}
return min;
}
//____________________________________________________________________________________________

static void intersection(int x[],int y[])
{
System.out.print("intersection= {");
for(int i=0;i<x.length;i++)
{
   for(int j=0;j<y.length;j++)
   {
   if(x[i]==y[j])
   System.out.print(y[j]+" ");
   }
}
System.out.println("}");
}

//______________________________________________________________________________________
static void union(int x[],int y[])
{
System.out.print("union= {");
for(int i=0;i<x.length;i++)
{   
 System.out.print(x[i]+" ");
}

for(int j=0;j<y.length;j++)
 {
   int count=0;
   for(int i=0;i<x.length;i++)
   { 
    if(y[j]!=x[i])
    count=count+1;
   }
   if(count==x.length)
   System.out.print(y[j]+" ");
 }
System.out.println("}");
}
//_____________________________________________________________________________

static void sort(int x[])
{
for(int j=0;j<x.length-1;j++)
  {
  for(int i=0;i<(x.length-1)-j;i++)
    {
     if(x[i]>x[i+1])
      {
       int t=x[i];
       x[i]=x[i+1];
       x[i+1]=t;
      }
    }
  }
System.out.print("sorted array is= ");
for(int i=0;i<x.length;i++)
System.out.print(x[i]+" ");
}

//________________________________________________________________

static void mergesort(int x[],int y[])
{
System.out.print("\nmergesort: ");
for(int j=0;j<x.length-1;j++)
  {
  for(int i=0;i<(x.length-1)-j;i++)
    {
     if(x[i]>x[i+1])
      {
       int t=x[i];
       x[i]=x[i+1];
       x[i+1]=t;
      }
    }
  }
for(int i=0;i<x.length;i++)
System.out.print(x[i]+" ");

for(int j=0;j<y.length-1;j++)
  {
  for(int i=0;i<(y.length-1)-j;i++)
    {
     if(y[i]>y[i+1])
      {
       int t=y[i];
       y[i]=y[i+1];
       y[i+1]=t;
      }
    }
  }
for(int i=0;i<y.length;i++)
System.out.print(y[i]+" ");
System.out.print("\n\n");
}

//__________________________________________________________________
static int max(int x[][])
{
int r=x.length;
int largest=x[0][0];
for(int i=0;i<=r-1;i++)
 {
   for(int j=0;j<=(x[i].length)-1;j++)
   {
    if(x[i][j]>largest)
    largest=x[i][j];
   }
 }
return largest;
}
//___________________________________________________________________________
static int min(int x[][])
{
int r=x.length;
int minimum=x[0][0];
for(int i=0;i<=r-1;i++)
 {
   for(int j=0;j<=(x[i].length)-1;j++)
   {
    if(x[i][j]<minimum)
    minimum=x[i][j];
   }
 }
return minimum;
}

//____________________________________________________

static int triangleASum(int x[][])
{
int sum=0;

for(int i=0;i<x.length;i++)
{
for(int j=0;j<=i;j++)
sum=sum+x[i][j];
}
return sum;
}

??___________________________________________________


static int triangleBSum(int x[][])
{
int sum=0;

for(int i=0;i<x.length;i++)
{
for(int j=0;j<=i;j++)
sum=sum+x[j][i];
}
return sum;
}


//___________________________________________

static int triangleAMax(int x[][])
{
int largest=x[0][0];
for(int i=0;i<x.length;i++)
{
for(int j=0;j<=i;j++)
if(x[i][j]>largest)
    largest=x[i][j];
}
return largest;
}

//______________________________________________________
static int triangleAMin(int x[][])
{
int minimum=x[0][0];
for(int i=0;i<x.length;i++)
{
for(int j=0;j<=i;j++)
if(x[i][j]<minimum)
    minimum=x[i][j];
}
return minimum;
}

//________________________________________________________________


static int triangleBMax(int x[][])
{
int largest=x[0][0];
for(int i=0;i<x.length;i++)
{
for(int j=0;j<=i;j++)
if(x[j][i]>largest)
    largest=x[j][i];
}
return largest;
}

//________________________________________________________________

static int triangleBMin(int x[][])
{
int minimum=x[0][0];
for(int i=0;i<x.length;i++)
{
for(int j=0;j<=i;j++)
if(x[j][i]<minimum)
    minimum=x[j][i];
}
return minimum;
}

//________________________________________________________
static void matrixAllSum(int x[][])
{
int z[][];
int di=0;
z=new int [(x.length)+1][];

for(int i=0;i<(x.length)+1;i++)
{
z[i]=new int[(x.length)+1];
}



for(int i=0;i<x.length;i++)
{

for(int j=0;j<x.length;j++)
{
z[i][j]=x[i][j];
}

}


for(int j=0;j<x.length;j++)
{
int row=0;
int col=0;
for(int k=0;k<x.length;k++)
{
row=row+x[j][k];
}
z[j][x.length]=row;


for(int k=0;k<x.length;k++)
{
col=col+x[k][j];
}
z[x.length][j]=col;
}

for(int j=0;j<x.length;j++)
{
di=di+x[j][j];
}
z[x.length][x.length]=di;



System.out.print("\n\nmatrix all sum:\n");
for(int k=0;k<z.length;k++)
{
for(int j=0;j<z.length;j++)
{
System.out.print(z[k][j]+"\t");
}
System.out.print("\n");
}


}



//___________________________________________________________________


static void matrixMultiply(int x[][],int y[][])
{

int z[][];
z=new int[x.length][];
for(int i=0;i<x.length;i++)
z[i]=new int[y[0].length];

/*
for(int j=0;j<x[0].length;j++)
{


int v=0;
for(int i=0;i<x.length;i++)
{


for(j=0;j<x[0].length;j++)
{
int m=x[i][j];


for(j=0;j<y[0].length;j++)
{
for(i=0;i<x[0].length;i++)
{
int n=y[i][j];
v=v+m*n;
}
}
}
}
for(int i=0;i<x.length;i++)
{
for(j=0;j<y[0].length;j++)
{
z[i][j]=v;
}
}
}
for(int i=0;i<x.length;i++)
{
for(int j=0;j<y[0].length;j++)
{
System.out.print(z[i][j]+"\t");
}
System.out.print("\n");
}*/


for(int i=0;i<x.length;i++)
{
for(int j=0;j<x.length;j++)
{
for(int k=0;k<x.length;k++)
{
z[i][j]=z[i][j]+x[i][k]*y[k][j];
}
}
}


System.out.print("\n\nproduct of matrices:\n");
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x.length;j++)
System.out.print(z[i][j]+"\t");
System.out.print("\n");
}
}


//____________________________________________________________________________
public static void main(String... a)
{
int ary[][];
int bry[][];
int ar[]=new int[5];
ar[0]=8;
ar[1]=6;
ar[2]=2;
ar[3]=4;
ar[4]=9;

int br[]=new int[6];
br[0]=1;
br[1]=6;
br[2]=3;
br[3]=8;
br[4]=9;
br[5]=7;

System.out.println("enter no. of rows: ");
Scanner s=new Scanner(System.in);
int row=s.nextInt();
ary=new int [row][];

for(int i=0;i<row;i++)
{
System.out.println("enter no. of columns for row"+(i+1)+": ");
int col=s.nextInt();
ary[i]=new int[col];
System.out.println("enter elements: ");
for(int j=0;j<ary[i].length;j++)
{
ary[i][j]=s.nextInt();
}

}

System.out.print("\n");
System.out.print("\n");
for(int i=0;i<row;i++)
{
for(int j=0;j<ary[i].length;j++)
{
System.out.print(ary[i][j]+"\t");
}
System.out.print("\n");
}
System.out.print("\n");
System.out.print("\n");
System.out.print("\n");



System.out.println("enter no. of rows: ");
Scanner ss=new Scanner(System.in);
int rows=ss.nextInt();
bry=new int [rows][];

for(int i=0;i<rows;i++)
{
System.out.println("enter no. of columns for row"+(i+1)+": ");
int cols=ss.nextInt();
bry[i]=new int[cols];
System.out.println("enter elements: ");
for(int j=0;j<bry[i].length;j++)
{
bry[i][j]=s.nextInt();
}

}

System.out.print("\n");
System.out.print("\n");
for(int i=0;i<rows;i++)
{
for(int j=0;j<bry[i].length;j++)
{
System.out.print(bry[i][j]+"\t");
}
System.out.print("\n");
}
System.out.print("\n");
System.out.print("\n");
System.out.print("\n");

System.out.println("\nmax="+max(ar));
System.out.println("min="+min(ar));
intersection(ar,br);
union(ar,br);
sort(br);
mergesort(ar,br);
System.out.print("max of matrix= :"+max(bry)+"\n");
System.out.print("min of matrix= :"+min(bry)+"\n");
System.out.println("triangle A sum= "+triangleASum(bry));
System.out.println("triangle B sum= "+triangleBSum(bry));
System.out.println("triangle A maximum= "+triangleAMax(bry));
System.out.println("triangle A minimum= "+triangleAMin(bry));
System.out.println("triangle B maximum= "+triangleBMax(bry));
System.out.println("triangle B minimum= "+triangleBMin(bry));

matrixMultiply(ary,bry);
matrixAllSum(bry);
}

}