package bitmasking.setBit;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc =new Scanner(System.in);

        int n=0,index=0,mask=0, newnumber=0;

        System.out.println("enter the number ");         
        n=sc.nextInt();

        System.out.println("enter the index ");
        index=sc.nextInt();
        sc.close();
        
        mask=1<<(index-1);

        newnumber=mask|n;

        System.out.println("new number is "+newnumber);
    }
    
}
