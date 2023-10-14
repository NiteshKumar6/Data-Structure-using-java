package javadsa.String;
import java.io.*;
import java.util.Scanner;
public class strcount {
	
	static int countStr(int n,int bCount, int cCount)
	                    
	{
	   
	    if (bCount < 0 || cCount < 0) return 0;
	    if (n == 0) return 1;
	    if (bCount == 0 && cCount == 0) return 1;
	 
	   
	    int result = countStr(n - 1, bCount, cCount);
	    result += countStr(n - 1, bCount - 1, cCount);
	    result += countStr(n - 1, bCount, cCount - 1);
	 
	    return result;
	}
	 
	
	public static void main (String[] args)
	{
	        int num;
	 
	        // Input the integer
	        System.out.println("Enter the integer: ");
	 
	        // Create Scanner object
	        Scanner s = new Scanner(System.in);
	 
	        // Read the next integer from the screen
	        num = s.nextInt();
	        System.out.println("The number of strings possible are : ");
	        System.out.println(countStr(num , 1, 2));
	}
	}

