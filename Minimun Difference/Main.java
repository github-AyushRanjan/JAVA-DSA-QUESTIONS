
import java.util.*;

public class Main{
    public static void main(String[] args) {
        int []arr={12,9,8,2,11,4,6,5,5};

         List<List<Integer>> output=minDifference(arr);

         System.out.println(output);

    }
    static List<List<Integer>> minDifference(int []arr){
        List<List<Integer>> ans=new  ArrayList<>();
        Arrays.sort(arr);

        int minvalue=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        minvalue=Math.min(minvalue,arr[i]-arr[i-1]);
        
        for(int i=1;i<arr.length;i++)
        if(arr[i]-arr[i-1] == minvalue)
            {List<Integer> temp=new ArrayList<Integer>();
            temp.add(arr[i-1]);
            temp.add(arr[i]);
            ans.add(temp);
            }
    return ans;
    }
}