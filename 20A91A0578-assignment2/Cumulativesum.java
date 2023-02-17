import java.util.*;
class Cumulativesum
{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=s.nextInt();
    System.out.println("Enter the Elements into Array:");
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=s.nextInt();
    System.out.print(a[0]+" ");
    for(int i=1;i<n;i++)
    {
        a[i]=a[i]+a[i-1];
        System.out.print(a[i]+" ");
    }
   
     s.close();
}
}