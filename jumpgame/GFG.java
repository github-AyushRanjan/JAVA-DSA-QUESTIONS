

//{ Driver Code Starts
    import java.io.*;
   
    
    class GFG {
        public static void main(String args[]) throws IOException {
            BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                int N = Integer.parseInt(read.readLine());
                
                String S1[] = read.readLine().split(" ");
                
                int[] A = new int[N];
                
                for(int i=0; i<N; i++)
                    A[i] = Integer.parseInt(S1[i]);
    
                
                System.out.println(Solution.canReach(A,N));
            }
        }
    }
    // } Driver Code Ends
    
    
    //User function Template for Java
    
    class Solution {
        static int canReach(int[] A, int N) {
        
            int index=0;
            while(index<N-1){
                if(index==(index+A[index])){
                    int nw=index-1;
                    int flag=1;
                    while(index!=nw)
                    { 
                          if(A[nw]>index)
                           {
                            index=nw;
                            flag=0;
                            break; ///////
                            }              
                    
                      nw--;
                    }
                    if(flag!=0)
                    return 0;
                }
                   ////
                index= index+A[index];
            }
            return 1;

        }
    };//  5 (5+0)