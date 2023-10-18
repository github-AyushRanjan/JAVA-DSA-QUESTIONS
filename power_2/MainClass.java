package power_2;

public class MainClass {
    public static void main(String[] args) {
        int arr[]={1,2,6};
        int multi=arr[0];
        int count=0;


        for(int i=0;i<3;i++){
         multi=1;
         for(int j=i;j<3;j++)
            {   multi=multi*arr[j];

                if(check2(multi))
                   { count++;
                   }        
            }}

            System.out.println(count);

    }

        static boolean check2(int n)
    {
        return (int)(Math.ceil((Math.log(n) / Math.log(2))))
            == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
    }

