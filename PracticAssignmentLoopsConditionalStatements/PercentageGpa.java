import java.util.Scanner;
class PercentageGpa {
public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   //Taking marks obtained & total marks;
   float securedmarks=input.nextFloat();
   int totalmarks=input.nextInt();
   float percentage=(securedmarks/totalmarks)*100;
   char grade;
   float gpa;
   if(90<=percentage&&100>=percentage){
    grade='A';
    gpa=4;
   }
   else if(80<=percentage&&89>=percentage)
   {
    grade='B';
    gpa=3;
   }
   else if(70<=percentage&&79>=percentage)
   {
    grade='C';
    gpa=2;
   }
   else if(60<=percentage&&69>=percentage)
   {
    grade='D';
    gpa=1;
   }
   else{
    grade='F';
    gpa=0;
   }
   System.out.println("Percentage:"+percentage);
   System.out.println("Grade "+grade+", GPA = "+gpa);
   input.close(); 
}    
}
