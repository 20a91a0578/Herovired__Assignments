import java.util.Scanner;
 class EvenOddcheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char o;
        do{
            System.out.println("Menu based app-Even/Odd Checker");
            System.out.print("Please enter the number: ");
            int a=input.nextInt();
            if(a%2==0)
            System.out.println("The given number - "+a+" is an EVEN Number");
            else
            System.out.println("The given number - "+a+" is a ODD number");
            System.out.print("Do you want to Continue : ");
            o=input.next().charAt(0);
        }
        while(o=='y'||o=='Y');
        input.close();
    }
}
