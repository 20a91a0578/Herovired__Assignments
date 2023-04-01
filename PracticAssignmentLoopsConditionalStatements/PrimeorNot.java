import java.util.Scanner;
 class PrimeorNot {
    public static boolean prime(int a){
        if(a<=1)
        return false;
        for(int i=2;i*i<=a;i++)
        {
            if(a%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sample input: num = ");
        int a=input.nextInt();
        if(prime(a))
        System.out.println("The given number "+a+" is a Prime number");
        else
        System.out.println("The given  number "+a+" is NOT a Prime number");
        input.close();
    }
}
