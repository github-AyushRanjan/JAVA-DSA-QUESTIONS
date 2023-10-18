package divisibleby_10.comp.divisible_10;


import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
       sc.close();
       Mainclass m=new Mainclass();
       System.out.println(m.digit(N));
    }
    public String digit(int N){
   StringBuilder s =new StringBuilder();

      // double x= (N % 9 + 1) *Math.pow(10, (N / 9)) - 1;
      if(N%9!=0)
      s.append(N%9);

      for(int i=0;i<N/9;i++){
         s.append("9");
      }      
      for (int i = 0; i < N; i++) {
         s.append("0") ;
      }

      return s.toString();
    }
 
}


