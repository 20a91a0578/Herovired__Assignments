import java.util.Scanner;
class MultiplicationTable{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        //Taking the Number for which you want to print the Multiplication table
        System.out.print("Enter the Number:");
        int num1=input.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(num1+" x "+i+" = "+(num1*i));
            i++;
        }
        input.close();
    }
}