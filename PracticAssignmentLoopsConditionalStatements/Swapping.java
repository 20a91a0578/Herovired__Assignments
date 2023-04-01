import java.util.Scanner;
class Swapping{
    public  int a;
    public  int b;
   
    public static void main(String[] args) {
    Scanner  input=new Scanner(System.in);
    System.out.println("Enter the a & b values");
    int a=input.nextInt();
    int b=input.nextInt();
    System.out.println("Before Swapping a = "+a+"   b= "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After  Swapping a = "+a+"   b= "+b);
      input.close();
        
    }
}