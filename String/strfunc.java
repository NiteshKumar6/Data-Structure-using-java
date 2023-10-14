package javadsa.String;
import java.io.*;
import java.util.Scanner;
public class strfunc {
	
		public static void main(String[] args) {
		    float num;
	        // Input the integer
	        System.out.println("Enter the integer: ");
	        // Create Scanner object
	        Scanner s = new Scanner(System.in);
	        // Read the next integer from the screen
	        num = s.nextFloat();
	        // String str = intToRoman(num);
	         int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	    
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i=0;i<values.length;i++) {
	        while(num >= values[i]) {
	            num -= values[i];
	            sb.append(strs[i]);
	        }
	    }
	        String answer = sb.toString();
	        System.out.println("The roman numeral for given integer is : " + answer);
		}
	}


