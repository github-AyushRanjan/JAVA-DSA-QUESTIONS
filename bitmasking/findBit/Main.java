import java.util.Scanner;


class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n=0 ,mask=0,index=0;

    System.out.println("enter the number ");
    n=sc.nextInt();
    
    System.out.println("enter the index ");
    index=sc.nextInt();
    sc.close();
    
    mask=1<<(index-1);

    if((n|mask) ==0)
        System.out.println(index+"th place is  0");
    else
        System.out.println(index+"th place is 1");
    }
}