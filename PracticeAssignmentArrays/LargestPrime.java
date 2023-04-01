import java.util.Scanner;
class LargestPrime {
    public static boolean isPrime(int n)
    {
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++)
        if(n%i==0)return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\nEnter array elements separated by space\n");
        String ele=input.nextLine();
        String elements[]=ele.split(" ");
        int arr[]=new int[elements.length];
        for(int i=0;i<elements.length;i++)
        {
            arr[i]=Integer.parseInt(elements[i]);
        }
        int prim=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(isPrime(arr[i]))
            {
                prim=Math.max(prim,arr[i]);
            }
        }
        System.out.println("The Largest Prime number in given array: "+prim);
        input.close();
    }
}
