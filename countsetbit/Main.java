//{ Driver Code Starts
//Initial Template for Java
package countsetbit;
import java.util.*;

import java.io.*;



// } Driver Code Ends
//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public  int countSetBits(int n){
    
         int x= largestprestpower(n);
     
     int ans1= x* (1<<(x-1));
     int ans2=n-(1<<x)+1 ;
     int pass=n-(1<<x);
     
     int finalans= ans1 + ans2+ countSetBits(pass);
     return finalans;
        
    }
       
 int largestprestpower(int m){
     int x=0;
     while((1<<x)<=m)
        x++;
     
     return x-1;
 }   
 
 
 
}

//{ Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int  n;
		while(t-->0) {
	        n = sc.nextInt();//input n
            sc.close();
            
		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		}
	}
}

// } Driver Code Ends