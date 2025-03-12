import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args) 
    {
        System.out.println("enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("--------------------------------------");
    int f=0;
    int s=1;
    System.out.println(f);
    System.out.println(s);
    for(int i=2;i<n;i++)
    {

        int t=f+s;
        System.out.println(t); 
        f=s;
        s=t;   
    }
    }
}
