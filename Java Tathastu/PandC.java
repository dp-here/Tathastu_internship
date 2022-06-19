import java.util.Scanner;
public class PandC{
    public static int permutate(int n, int r){
    int f1=n;
    int f2=n-r;
    for(int i=f1-1;i>=1;i--){
    f1=f1*i;    
    }
    for(int i=f2-1;i>=1;i--){
    f2=f2*i;    
    }
    int ansp=f1/f2;
    return ansp;
    }
    public static int combination(int n, int r){
    int ansp=permutate(n,r);    
    int num=r;
    for(int i=num-1;i>=1;i--){
    num=num*i;    
    }
    int ansc=ansp/num;
    return ansc;
    }
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n ");
    int n=sc.nextInt();
    System.out.println("Enter the value of r ");
    int r=sc.nextInt();
    System.out.println("The permutation of n and r is "+permutate(n,r));
    System.out.println("The combination of n and r is "+combination(n,r));
    }
}