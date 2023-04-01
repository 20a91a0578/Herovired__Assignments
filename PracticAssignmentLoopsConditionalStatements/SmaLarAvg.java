import java.util.Scanner;
class SmaLarAvg{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sample input: num1 = ");
        int abc=input.nextInt();
        System.out.print("num2 = ");
        int def=input.nextInt();
        System.out.print("num3 = ");
        int ghi=input.nextInt();
        System.out.println("The Smallest Number: "+((abc < def) ? (abc < ghi ? abc : ghi) : (def < ghi ? def : ghi)));
        System.out.println("The Largest  Number: "+((abc > def) ? (abc > ghi ? abc : ghi) : (def > ghi ? def : ghi)));
        System.out.println("Average of all three numbers: "+(abc+def+ghi)/3);
        input.close();
    }
}