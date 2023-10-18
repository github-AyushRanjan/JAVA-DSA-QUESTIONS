//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;

public class Main {

    
    static int Bsearch(int []arr,int n){
        
        int max=0;
        int start =0;
        int end = n-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                 max=arr[mid];
                 break;
            }else if(arr[mid]> arr[mid+1]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
    int arr[]={1, 15 ,25, 45, 42, 21, 17, 12, 11};
    
    int m=Bsearch(arr,9);
    System.out.println("hello  ");
    System.out.println(m);
       
 }
    
}



// class Solution {
//     int findMaximum(int[] arr, int n) {
//         return Bsearch(arr,n);
//     }
    
//     int Bsearch(int []arr,int n){
        
//         int max=0;
//         int start =0;
//         int end = n-1;
//         while(start<=end){
//             int mid = (start+end)/2;
//             if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
//                  max=arr[mid];
//             }else if(arr[mid]> arr[mid+1]){
//                 end = mid-1;
//             }else {
//                 start = mid+1;
//             }
//         }
//         return max;
//     }
// }