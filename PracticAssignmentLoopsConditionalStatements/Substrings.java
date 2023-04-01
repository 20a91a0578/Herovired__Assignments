import java.util.Scanner;
 class Substrings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sample input : stringName:");
        String string=input.next();
        System.out.print("Starting index :");
        int st=input.nextInt();
        System.out.print("Ending index:");
        int end=input.nextInt();
        System.out.println("Output: subString of "+string+" from "+st+" to "+end+" is: "+string.substring(st, end+1));
        input.close();
    }
}
