import java.util.Scanner;

class Main{
    public static void main (String[] args)
	{
	     //taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	    	 
    	 //taking the 2 strings
    	
        String s1=sc.next();    // next for single word ---- nextLine for statement
    	String s2=sc.next();
    	sc.close();

    	//creating an object of class Geeks
    	Geeks obj=new Geeks();
    	   
        System.out.println(obj.coutChars(s1,s2));
    	   
    	 }
    }



 class Geeks{
    
    
    int coutChars(String s1, String s2)
    {
        int[] m1 = new int[26];
        int[] m2 = new int[26];
        
        for (int i = 0; i < s1.length(); ++i) {
            char ch = s1.charAt(i);
            m1[ch - 'a']++;
        }
        for (int i = 0; i < s2.length(); ++i) {
            char ch = s2.charAt(i);
            m2[ch - 'a']++;
        }
        
        int count = 0;
        for (int i = 0; i < 26; ++i) {
            count += Math.abs(m1[i] - m2[i]);
        }
        
        return count;
    }


}
