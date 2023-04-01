 import java.util.Scanner;
 class ReverseArray {
    public static void reverse(int arr[]){
        int i=0,j=arr.length-1;
        while(i<=j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
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
        reverse(arr);
        System.out.println("Reversed Elements are:");
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
