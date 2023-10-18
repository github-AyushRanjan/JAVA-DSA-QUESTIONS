import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int base=sc.nextInt();
        int power=sc.nextInt();
        sc.close();
        System.out.println("value is "+ fastpower(base,power));

    }
    static int fastpower(int b , int p){
        if(p==0)
         return 1;
        
        if((p&1)!=0)
         return b*fastpower(b, p-1);
        return fastpower(b*b, p/2);
    }
}