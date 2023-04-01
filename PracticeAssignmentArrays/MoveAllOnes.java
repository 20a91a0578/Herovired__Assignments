import java.util.Scanner;
class MoveAllOnes {
    public static void moveones(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]==1)
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;

                }
            }
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
        moveones(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
