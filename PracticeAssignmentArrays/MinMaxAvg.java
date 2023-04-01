import java.util.Scanner;
class MinMaxAvg{
    static void minMaxAvgCount(int arr[]){
       int s=0;
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       int n=arr.length;
        for(int i=0;i<n;i++)
        {
            s+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The element with minimum value :"+min);
        System.out.println("The element with Maximum Value :"+max);
        System.out.println("Average of all array elements : "+(s/n));
        System.out.println("Total number of array elements: "+n);
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
        minMaxAvgCount(arr);
        input.close();
    }
}