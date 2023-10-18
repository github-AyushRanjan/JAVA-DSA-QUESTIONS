import java.lang.annotation.Target;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int arr[][]={
            {25,3,2,9},
            {2,3},
            {1,0,98,33,321}};

        int target=98;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        }

        static int[] search(int arr[][],int t){
            for(int row=0;row<arr.length;row++){
                for(int col=0;col<arr[row].length;col++)
                 if(arr[row][col]==t)
                  return new int []{row,col};
            }
            
            return new int []{-1,-1};
        }
    }
