// package bitmasking.clearBit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n=0,index=0,mask=0,newnumber=0;

    System.out.println("enter the number ");
    n=sc.nextInt();

    System.out.println("enter the index ");
    index=sc.nextInt();
    sc.close();

    mask=1<<(index-1);
    mask=~mask;

    newnumber=mask&n;

    System.out.println("the new number is "+ newnumber);
    


}
    
}
