class Printpattern {
 public static void main(String[] args) {
    int ap=5;
    for(int i=ap;i>0;i--)
    {
        for(int j=0;j<i;j++)
        System.out.print("* ");
        System.out.println();
    }
    for(int i=2;i<=ap;i++)
    {
        for(int j=0;j<i;j++)
        System.out.print("* ");
        System.out.println();
    }
 }
}
