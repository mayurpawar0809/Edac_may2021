import java.util.*;
class Patternz133
{ 
      
    public static void main(String args[]) 
    { 
        int n = 6; 
      
        printPattern(n); 
    } 
      
    static void printPattern(int n) 
    { 
        int i, j, k = 0; 
        for (i = 1; i <= n; i++) // row=6 
        { 
            // Print spaces 
            for (j = i; j < n; j++) 
	     { 
                System.out.print(" "); 
            } 
            
            // Print *
            while (k != (2 * i - 1))
                { 
                if (k == 0 || k == 2 * i - 2) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
                k++; 
                
            } 
            k = 0; 
              
            // print next row 
            System.out.println();  
        } 
        // print last row 
        for (i = 0; i < 2 * n - 1; i++) { 
            System.out.print("*"); 
        } 
    } 
} 
  
