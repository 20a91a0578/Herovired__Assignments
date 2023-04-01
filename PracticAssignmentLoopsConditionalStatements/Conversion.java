import java.util.Scanner;
class Conversion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char o;
        do{
            System.out.println("\nMenu based app - Unit conversion for Distance\n1.CM to M\n2.M to KM\n3.KM to M\n4.M to CM");
            System.out.print("Enter your menu - ");
            int ip=input.nextInt();
            System.out.print("Please enter the CM Value: ");
            double val=input.nextDouble();
            if(ip==1){
                System.out.printf("%d CM = %.2f M\n",(int)val,(val/100));
            }
            else if(ip==2)
            {
                System.out.printf("%.2f M = %.2f KM\n",val,(val/1000));
            }
            else if(ip==3){
                System.out.printf("%.2f KM = .%2f M\n",val,(val*1000));
            }
            else if(ip==4)
            {
                System.out.printf("%.2f M = %.2f CM\n",val,(val*100));
            }
            else{
                System.out.println("Invalid Choice");
            }
            System.out.print("Do you want to Continue:");
            o=input.next().charAt(0);
        }while(o=='y'||o=='Y');
        input.close();
    }
}