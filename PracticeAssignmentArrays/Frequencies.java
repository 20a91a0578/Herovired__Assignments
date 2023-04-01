import java.util.Scanner;
import java.util.HashMap;
class Frequencies {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\nEnter array1 elements separated by space\n");
        String Aele=input.nextLine();
        System.out.println("\nEnter array2 elements separated by space\n");
        String Bele=input.nextLine();
        String Aelements[]=Aele.split(" ");
        String Belements[]=Bele.split(" ");
        int Aarr[]=new int[Aelements.length];
        int Barr[]=new int[Belements.length];
        for(int i=0;i<Aelements.length;i++)
        {
            Aarr[i]=Integer.parseInt(Aelements[i]);
        }
        for(int i=0;i<Belements.length;i++)
        {
            Barr[i]=Integer.parseInt(Belements[i]);
        }
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<Barr.length;i++)
        {
            if(!hs.containsKey(Barr[i]))
            hs.put(Barr[i],0);
        }
        for(int i=0;i<Aarr.length;i++)
        {
            if(hs.containsKey(Aarr[i]))
            hs.put(Aarr[i],hs.get(Aarr[i])+1);
        }
        for(Integer ele:hs.keySet()){
            System.out.println("Frequency of "+ele+" : "+hs.get(ele));
        }
        input.close();
    }
}
