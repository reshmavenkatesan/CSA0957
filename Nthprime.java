import java.util.Scanner;
public class Nthprime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=input.nextInt();
        int a[]=new int[100];
        int x=0;
        int i=2;
        while(x<100) {
            int fact=0;
            for(int j=1;j<=i;j++) {
                if(i%j==0)
                    fact++;
            }
            if(fact==2) {
                a[x] = i;
                x++;
            }
            i++;
        }
        System.out.println(n+"th prime number is "+a[n-1]);
        System.out.print("Next "+n+" prime numbers after "+a[n-1]+" are: ");
        int start = n;
        while(start < n+n) {
            System.out.print(a[start]+" ");
            start++;
        }
    }
}